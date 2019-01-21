package com.sms.util.mybatis.generator;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.internal.DefaultCommentGenerator;

import java.util.Properties;

public class MyCommentGenerator extends DefaultCommentGenerator {
    private Properties properties;

    private boolean suppressDate;

    private boolean suppressAllComments;

    public MyCommentGenerator(){
        super();
        properties=new Properties();
        suppressDate=false;
        suppressAllComments=false;
    }

    public void addFieldComment(Field field, IntrospectedTable introspectedTable,
                                IntrospectedColumn introspectedColumn){
        if(suppressAllComments){
            return;
        }
        field.addJavaDocLine("/**");
        StringBuilder sb=new StringBuilder();
        sb.append(" * ");
        sb.append(introspectedColumn.getRemarks());
        field.addJavaDocLine(sb.toString().replace("\n"," "));
        field.addJavaDocLine("**/");
    }

    public void addFieldComment(Field field, IntrospectedTable introspectedTable){

    }

    public void addGeneralMethodComment(Method method,
                                 IntrospectedTable introspectedTable){

    }

    public void addGetterComment(Method method,
                          IntrospectedTable introspectedTable,
                          IntrospectedColumn introspectedColumn){

    }

    public void addSetterComment(Method method,
                          IntrospectedTable introspectedTable,
                          IntrospectedColumn introspectedColumn){

    }

}
