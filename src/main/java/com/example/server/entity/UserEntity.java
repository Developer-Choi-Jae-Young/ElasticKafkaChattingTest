package com.example.server.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String email;

    private String password;

    private String name;

    private String nickName;

    private String address;

    private String phoneNumber;

    @Builder
    public UserEntity(String email,String password,String name,String nickName,String address,String phoneNumber)
    {
        this.email = email;
        this.password = password;
        this.name = name;
        this.nickName = nickName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
}

