package com.example.springbootdemo.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.springbootdemo.service.NetflixService;
import com.example.springbootdemo.service.YoutubeService;

@Configuration
public class BeanConfiguration {
    @Bean
    @ConditionalOnProperty(prefix = "service.type", name = "video", havingValue = "youtube")
    YoutubeService youtubeService() {
        return new YoutubeService();
    }

    @Bean
    @ConditionalOnProperty(prefix = "service.type", name = "video", havingValue = "netflix")
    NetflixService netflixService() {
        return new NetflixService();
    }
}