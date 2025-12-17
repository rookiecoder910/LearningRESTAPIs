package com.codingshuttle.youtube.LearningRESTAPIs.config;

import com.codingshuttle.youtube.LearningRESTAPIs.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
