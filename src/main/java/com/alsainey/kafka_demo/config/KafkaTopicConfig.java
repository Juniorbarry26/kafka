package com.alsainey.kafka_demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

@Configurable
public class KafkaTopicConfig {

    @Bean
    public NewTopic topic() {
        return TopicBuilder
                .name("test-topic")
                .partitions(1)
                .replicas(1)
                .build();
    }
}
