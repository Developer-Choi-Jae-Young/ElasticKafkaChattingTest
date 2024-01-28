package com.example.server.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
public class ChattingRoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String roomName;

    private int limitNumberOfPeople;

    private int currentNumberOfPeople;

    //@OneToMany
    //private List<UserEntity> userEntity;

    @Builder
    public ChattingRoomEntity(String roomName, int limitNumberOfPeople, int currentNumberOfPeople)
    {
        this.roomName = roomName;
        this.limitNumberOfPeople = limitNumberOfPeople;
        this.currentNumberOfPeople = currentNumberOfPeople;
    }
}
