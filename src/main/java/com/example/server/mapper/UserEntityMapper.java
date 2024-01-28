package com.example.server.mapper;

import com.example.server.dto.RegistUserRequestDto;
import com.example.server.entity.UserEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserEntityMapper extends BaseEntityMapper<RegistUserRequestDto, UserEntity>{
    UserEntityMapper INSTANCE = Mappers.getMapper( UserEntityMapper.class );
}
