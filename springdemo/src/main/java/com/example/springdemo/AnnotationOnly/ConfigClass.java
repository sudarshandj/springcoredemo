package com.example.springdemo.AnnotationOnly;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.example.springdemo.AnnotationOnly")
@PropertySource("classpath:CompanyInfo.properties")
public class ConfigClass {

    /*@Bean
    public SoftwareEngineer engineer(){
        return new SoftwareEngineer();
    }

    @Bean
    public Company company(){
        Company company = new Company(engineer());
        //company.setSoftwareEngineer(engineer());
        return company;
    }*/
}
