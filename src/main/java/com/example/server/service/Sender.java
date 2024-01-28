package com.example.server.service;

import com.example.server.dto.ChattingMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Sender {
    private final KafkaTemplate<String, ChattingMessage> kafkaTemplate;

    public void send(String topic, ChattingMessage data, Integer partition) {
        kafkaTemplate.send(topic,partition,null, data);
    }
}
