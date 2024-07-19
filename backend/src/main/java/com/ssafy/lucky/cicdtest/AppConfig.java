package com.ssafy.lucky.cicdtest;

import java.util.Date;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class AppConfig implements WebMvcConfigurer{
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Add resource handler for serving static files
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/");
    }
}

