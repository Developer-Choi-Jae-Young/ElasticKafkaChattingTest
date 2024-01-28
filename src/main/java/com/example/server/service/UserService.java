package com.example.server.service;

import com.example.server.dto.RegistUserRequestDto;
import com.example.server.dto.RegistUserResponseDto;
import com.example.server.entity.UserEntity;
import com.example.server.mapper.UserEntityMapper;
import com.example.server.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {
    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    @Transactional
    public RegistUserResponseDto RegistUser(RegistUserRequestDto registUserRequestDto)
    {
        log.info(registUserRequestDto.getEmail());
        UserEntity user = userEntityMapper.toEntity(registUserRequestDto);
        log.info(user.getEmail());
        return RegistUserResponseDto.of(userRepository.save(userEntityMapper.toEntity(registUserRequestDto)));
    }
}
