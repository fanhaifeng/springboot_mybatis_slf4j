package com.example.demo.server;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
@Data
@ConfigurationProperties(prefix = "my")
public class Config {

    @Value("${servers}")
    private List<String> servers = new ArrayList<String>();
}

