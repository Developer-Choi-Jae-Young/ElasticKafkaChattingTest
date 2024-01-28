package com.example.server.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ResposeDto{
    private Long ResponseState;

    private LocalDateTime ResponseTime;

    private String Message;
}
