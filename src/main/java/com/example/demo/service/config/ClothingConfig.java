package com.example.demo.service.config;

import com.example.demo.service.common.Blouse;
import com.example.demo.service.common.Dress;
import com.example.demo.service.common.Trousers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClothingConfig {

    @Bean
     public Blouse blouse(){
        var blouse = new Blouse();
        blouse.getType();
        return blouse;
    }

    @Bean
    public Trousers trousers(){
        var trousers = new Trousers();
        trousers.getType();
        return trousers;
    }
    @Bean
    public Dress dress(){
        var dress = new Dress();
        dress.getType();
        return dress;
    }
}
