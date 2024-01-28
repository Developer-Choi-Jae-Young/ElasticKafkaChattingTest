package com.example.server.document;

import jakarta.persistence.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "mysql")
public class ChattingRoomDocument {
    @Id
    private Long Id;

    private String roomName;

    private int limitNumberOfPeople;

    private int currentNumberOfPeople;
}
