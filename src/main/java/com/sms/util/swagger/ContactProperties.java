package com.sms.util.swagger;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class ContactProperties implements Serializable{
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String url;
    @Getter @Setter
    private String email;
}
