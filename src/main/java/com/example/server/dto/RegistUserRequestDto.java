package com.example.server.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class RegistUserRequestDto {
    private Long Id;
    private String email;
    private String password;
    private String name;
    private String nickName;
    private String address;
    private String phoneNumber;
}
