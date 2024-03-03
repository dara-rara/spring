package com.example.demo.service;

import com.example.demo.service.common.Blouse;
import com.example.demo.service.common.Dress;
import com.example.demo.service.common.Trousers;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceClothing {
    //ошибка с аннотацией @Log4j2
    private static final org.apache.logging.log4j.Logger log =
            org.apache.logging.log4j.LogManager.getLogger(ServiceClothing.class);
    private final Blouse blouse;
    @Autowired
    private Dress dress;
    private Trousers trousers;

    @Autowired
    public ServiceClothing(Blouse blouse) {
        this.blouse = blouse;
    }

    @Autowired
    public void setTrousers(Trousers trousers) {
        this.trousers = trousers;
    }

    @PostConstruct
    public void postConstruct() {
        log.info("Service created");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("Service destroyed");
    }
}
