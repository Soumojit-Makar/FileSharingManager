package com.file_sharing.app.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Indicates that this class contains configuration settings
public class AppConfig {

    /**
     * Configures a ModelMapper bean to be used for mapping between DTOs and entities.
     * ModelMapper will be automatically available in the Spring context for dependency injection.
     *
     * @return a new instance of ModelMapper
     */
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
