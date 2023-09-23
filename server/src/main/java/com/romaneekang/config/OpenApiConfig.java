package com.romaneekang.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * openopi 界面配置
 */
@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI springShopOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("ROMANEEKANG")
                        .description("knife4j使用")
                        .version("1.0")
                        .contact(new Contact()
                                .name("romaneekang")
                                .email("weikang0324@163.com")));
    }
}
