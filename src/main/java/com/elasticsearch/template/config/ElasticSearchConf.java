package com.elasticsearch.template.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;

import javax.transaction.Transactional;

@Configuration
public class ElasticSearchConf {

    @Value("${spring.data.elasticsearch.username}")
    private String elasticsearchUserName;

    @Value("${spring.data.elasticsearch.password}")
    private String elasticsearchPassword;

    @Value("${spring.data.elasticsearch.localhost}")
    private String elasticsearchLocalHost;

    @Bean
    public RestHighLevelClient client(){
        ClientConfiguration clientConfiguration = ClientConfiguration.builder()
                .connectedTo(elasticsearchLocalHost)
                .withBasicAuth(elasticsearchUserName,elasticsearchPassword)
                .build();
        return RestClients.create(clientConfiguration).rest();
    }

    @Bean
    public ElasticsearchOperations elasticsearchTemplate(){
        return new ElasticsearchRestTemplate(client());
    }

}
