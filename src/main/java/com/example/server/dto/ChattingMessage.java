package com.example.server.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ChattingMessage implements Serializable {
    private String message;
    private String user;
    private Long timeStamp;

    private String fileName;
    private String rawData;
}
