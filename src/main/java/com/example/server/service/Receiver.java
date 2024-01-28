package com.example.server.service;

import com.example.server.dto.ChattingMessage;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
//Kafka server로부터 수신 할 수 있는 Receiver을 만들어준다. 메시지를 수신하여 연결된 React client로 STOMP 프로토콜을 이용해 메시지를 송신한다.
@Service
@Slf4j
@RequiredArgsConstructor
public class Receiver {

    private final SimpMessagingTemplate template;

    //@KafkaListener(topics = "kafka-chatting", groupId = "consumer_group1")
    @KafkaListener(groupId = "consumer_group1", topicPartitions = @TopicPartition(topic = "kafka-chatting", partitions = {"1"}))
    public void receive(ChattingMessage message) throws Exception {
        HashMap<String, String> msg = new HashMap<>();
        msg.put("timestamp", Long.toString(message.getTimeStamp()));
        msg.put("message", message.getMessage());
        msg.put("author", message.getUser());

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(msg);

        this.template.convertAndSend("/subscribe/public", json);
    }
}
