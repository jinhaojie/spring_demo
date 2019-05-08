package com.spring.demo.service;

public class TestAopInterceptor {

    public void myMethod(){};

    /*@Before("execution(public void com.oumyye.dao.impl.UserDAOImpl.save(com.oumyye.model.User))")*/
    public void before() {
        System.out.println("method staet");
    }
    public void after() {
        System.out.println("method after");
    }
    public void AfterReturning() {
        System.out.println("method AfterReturning");
    }
    public void AfterThrowing() {
        System.out.println("method AfterThrowing");
    }
}
