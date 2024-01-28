package com.example.server.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Builder
@Getter
public class ChattingRoomRequestDto {
    private String roomName;
    private int limitNumberOfPeople;
    private int currentNumberOfPeople;
}
