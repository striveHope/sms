package com.sms.util.swagger;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class ApiInfoProperties implements Serializable{
    @Setter @Getter
    private String basePackage;
    @Setter @Getter
    private String title;
    @Setter @Getter
    private String description;
    @Setter @Getter
    private String termsOfServiceUrl;
    @Setter @Getter
    private String version;
    @Setter @Getter
    private String pathRegex;
}
