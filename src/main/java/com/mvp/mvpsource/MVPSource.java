package com.mvp.mvpsource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;
import java.util.function.Supplier;

@Configuration
public class MVPSource {

    Random random = new Random();
    @Bean
    public Supplier<String> source() {
        return () -> this.getClass() + " MVP Kafka Source Test " + random.nextInt();
    }
}