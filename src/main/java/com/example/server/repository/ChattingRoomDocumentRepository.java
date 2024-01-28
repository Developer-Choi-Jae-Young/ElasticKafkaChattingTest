package com.example.server.repository;

import com.example.server.document.ChattingRoomDocument;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChattingRoomDocumentRepository extends ElasticsearchRepository<ChattingRoomDocument, Long> {
    List<ChattingRoomDocument> findAllByRoomName(String roomName);
}
