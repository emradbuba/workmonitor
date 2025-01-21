package com.github.emradbuba.learning.workmonitor.rest_api_service.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Value("${app.version:unknown}")
    private String projectVersion;

    @Bean
    public OpenAPI defineOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("TODO (Title)")
                        .summary("TODO (Summary)")
                        .description("TODO (Description)")
                        .version("LearningProject: " + projectVersion)
                );
    }
}
