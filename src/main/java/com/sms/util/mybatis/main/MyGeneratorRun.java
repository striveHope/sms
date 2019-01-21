package com.sms.util.mybatis.main;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MyGeneratorRun {
    public static void main(String[] args) throws Exception{
        MyGeneratorRun run=new MyGeneratorRun();
        run.run();
    }

    public void run() throws Exception{
        List<String> warnings=new ArrayList<>();
        boolean overwrite=true;
        //System.out.println(this.getClass().getClassLoader().getResourceAsStream("com.sms.mybatis.generator/generatorConfig.xml"));
        InputStream inputStream=this.getClass().getClassLoader().getResourceAsStream("com.sms.mybatis.generator/generatorConfig.xml");
        ConfigurationParser cp=new ConfigurationParser(warnings);
        Configuration config=cp.parseConfiguration(inputStream);
        DefaultShellCallback callback=new DefaultShellCallback(overwrite);
        MyBatisGenerator generator=new MyBatisGenerator(config,callback,warnings);
        generator.generate(null);
    }
}
