package com.ssafy.lucky.cicdtest;

import java.util.Date;

import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig implements WebMvcConfigurer{
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Add resource handler for serving static files
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/");
    }
}

