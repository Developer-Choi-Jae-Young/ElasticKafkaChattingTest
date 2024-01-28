package com.example.server.service;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryBuilders;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.search.Hit;
import com.example.server.document.ChattingRoomDocument;
import com.example.server.dto.ChattingRoomRequestDto;
import com.example.server.mapper.ChattingRoomEntityMapper;
import com.example.server.repository.ChattingRoomDocumentRepository;
import com.example.server.repository.ChattingRoomRepository;
import jakarta.json.JsonException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.elasticsearch.client.elc.NativeQuery;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.SearchHit;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class ChattingRoomService {
    private final ChattingRoomRepository chattingRoomRepository;
    private final ChattingRoomDocumentRepository chattingRoomDocumentRepository;
    private final ChattingRoomEntityMapper chattingRoomEntityMapper;

    public List<ChattingRoomDocument> searchRoom(String roomName) {
       return chattingRoomDocumentRepository.findAllByRoomName(roomName);
    }

    public void save(ChattingRoomRequestDto chattingRoomRequestDto)
    {
        log.info(chattingRoomRequestDto.getRoomName());
        chattingRoomRepository.save(chattingRoomEntityMapper.toEntity(chattingRoomRequestDto));
    }
}
