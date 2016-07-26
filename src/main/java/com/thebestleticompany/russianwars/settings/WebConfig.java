package com.thebestleticompany.russianwars.settings;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.web.context.request.RequestContextListener;

@Configuration
@EnableSpringDataWebSupport
@ComponentScan("com.thebestleticompany.russianwars")
public class WebConfig {

    @Bean
    public RequestContextListener requestContextListener() {
        return new RequestContextListener();
    }
}
