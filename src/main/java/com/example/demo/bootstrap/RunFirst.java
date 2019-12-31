package com.example.demo.bootstrap;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Slf4j
@Component
public class RunFirst implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("application run first");
    }
}
