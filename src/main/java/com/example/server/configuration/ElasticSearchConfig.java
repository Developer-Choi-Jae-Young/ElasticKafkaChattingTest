package com.example.server.configuration;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
  /*
@Configuration
@EnableElasticsearchRepositories
//public class ElasticSearchConfig extends ElasticsearchConfiguration {

    @Value("${elasticsearch.host}")
    private String host;

    @Value("${elasticsearch.url}")
    private String url;

    @Value("${elasticsearch.port}")
    private int port;

    @Value("${elasticsearch.username}")
    private String username;

    @Value("${elasticsearch.password}")
    private String password;
    @Override
    public ClientConfiguration clientConfiguration() {
        return ClientConfiguration.builder()
                .connectedTo(host)
                .withBasicAuth(username,password)
                .build();
    }

    @Bean
    public ElasticsearchClient elasticsearchClient() {
        RestClient restClient = RestClient.builder(new HttpHost(url, port)).build();
        ElasticsearchTransport transport = new RestClientTransport(restClient, new JacksonJsonpMapper());
        return new ElasticsearchClient(transport);
    }
}
    */
