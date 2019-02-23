package com.sms.util.swagger;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    @ConfigurationProperties(prefix = "swagger")
    public ApiInfoProperties apiInfoProperties(){
        return new ApiInfoProperties();
    }

    @Bean
    @ConfigurationProperties(prefix = "swagger.contact")
    public ContactProperties contactProperties(){
        return new ContactProperties();
    }

    @Bean
    public Docket createRestApi(ApiInfoProperties apiInfoProperties,ContactProperties contactProperties){
        System.out.println(apiInfoProperties.getBasePackage());
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo(apiInfoProperties,contactProperties))
                .select()
                .apis(RequestHandlerSelectors.basePackage(apiInfoProperties.getBasePackage()))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(ApiInfoProperties apiInfoProperties,ContactProperties contactProperties){
        Contact contact=new Contact(contactProperties.getName(),contactProperties.getUrl(),contactProperties.getEmail());
        return new ApiInfoBuilder()
                .contact(contact)
                .description(apiInfoProperties.getDescription())
                .title(apiInfoProperties.getTitle())
                .termsOfServiceUrl(apiInfoProperties.getTermsOfServiceUrl())
                .version(apiInfoProperties.getVersion())
                .build();
    }
}
