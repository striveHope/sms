package com.sms.util.mybatis.configurer;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class SpringMyBatisConfigurer implements TransactionManagementConfigurer {
    @Autowired
    private DataSource dataSource;

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception{
        SqlSessionFactoryBean bean=new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        PathMatchingResourcePatternResolver resolver=new PathMatchingResourcePatternResolver();
        List<Resource> list=new ArrayList<>();
        Resource[] resources=resolver.getResources("classpath:com.sms.mapper.base/*.xml");
        list.addAll(Arrays.asList(resources));
        resources=resolver.getResources("classpath:com.sms.mapper/*.xml");
        list.addAll(Arrays.asList(resources));
        Resource[] resources1=new Resource[list.size()];
        for(int i=0;i<list.size();i++){
            resources1[i]=list.get(i);
        }
        bean.setMapperLocations(resources1);
        return bean.getObject();
    }

    @Bean
    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }
}
