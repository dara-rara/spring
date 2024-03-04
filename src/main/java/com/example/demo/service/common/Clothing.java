package com.example.demo.service.common;

import com.example.demo.service.ServiceClothing;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public interface Clothing {
    //ошибка с аннотацией @Log4j2 в IDEA Community
    static final org.apache.logging.log4j.Logger log =
            org.apache.logging.log4j.LogManager.getLogger(ServiceClothing.class);
    @PostConstruct
    default void postConstruct() {
        log.info("Bean created");
    }

    @PreDestroy
    default void preDestroy() {
        log.info("Bean destroyed");
    }

    void sew();
}