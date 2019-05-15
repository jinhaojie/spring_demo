package com.spring.demo.service;


import com.spring.demo.dao.Impl.UserDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("testService")
public class TestService {

    @Autowired
    private UserDAOImpl userDAO;

    public String  hello() {
        return userDAO.getAllUser().toString();
    }


    @Transactional
    public String  testTransction() {
        userDAO.deleteByPrimaryKey();
        if (true) {
//            throw new RuntimeException();
        }
        return "";
    }



}
