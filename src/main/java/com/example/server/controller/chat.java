package com.example.server.controller;

import com.example.server.dto.ChattingMessage;
import com.example.server.service.Sender;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class chat {
    private final Sender sender;

    @MessageMapping("/message")
    public void sendmessage(ChattingMessage message)
    {
        message.setTimeStamp(System.currentTimeMillis());
        sender.send("kafka-chatting", message, 0);
    }

    @MessageMapping("/message2")
    public void sendmessage2(ChattingMessage message)
    {
        message.setTimeStamp(System.currentTimeMillis());
        sender.send("kafka-chatting", message, 1);
    }
}
