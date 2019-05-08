package com.spring.demo.service;

import org.springframework.beans.factory.FactoryBean;


public class TestFactoryBean implements FactoryBean<String> {
    @Override
    public String getObject() throws Exception {
        return "TestFactoryBean hello";
    }

    @Override
    public Class<?> getObjectType() {
        return String.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
