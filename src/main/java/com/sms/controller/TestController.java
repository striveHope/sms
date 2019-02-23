package com.sms.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "测试接口")
@RequestMapping("/test")
public class TestController {

    @ApiOperation(value = "ds")
    @RequestMapping(value = "/one",method = RequestMethod.POST)
    public void test(){

    }
}
