package com.example.server.mapper;

import com.example.server.dto.ChattingRoomRequestDto;
import com.example.server.entity.ChattingRoomEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ChattingRoomEntityMapper extends BaseEntityMapper<ChattingRoomRequestDto, ChattingRoomEntity>{
    ChattingRoomEntityMapper INSTANCE = Mappers.getMapper( ChattingRoomEntityMapper.class );
}
