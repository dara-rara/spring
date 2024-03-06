package com.example.demo.service;

import com.example.demo.service.common.Clothing;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ServiceClothing {
    //ошибка с аннотацией @Log4j2 в IDEA Community
    private static final org.apache.logging.log4j.Logger log =
            org.apache.logging.log4j.LogManager.getLogger(ServiceClothing.class);
    private final Clothing blouse;
    @Autowired
    @Qualifier("dress")
    private Clothing dress;
    private Clothing trousers;

    public ServiceClothing(@Qualifier("blouse") Clothing blouse) {
        this.blouse = blouse;
    }

    @Autowired
    public void setTrousers(@Qualifier("trousers") Clothing trousers) {
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
