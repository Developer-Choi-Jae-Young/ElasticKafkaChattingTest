package com.example.server.dto;

import com.example.server.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class RegistUserResponseDto{
    private String Email;
    public static RegistUserResponseDto of(UserEntity userEntity)
    {
        return RegistUserResponseDto.builder().Email(userEntity.getEmail()).build();
    }
}
