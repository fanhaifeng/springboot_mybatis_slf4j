package com.example.demo.bootstrap;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Slf4j
@Component
public class RunSecond implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("application run second");
    }
}
