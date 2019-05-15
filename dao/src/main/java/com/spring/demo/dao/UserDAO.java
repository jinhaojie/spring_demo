package com.spring.demo.dao;

import com.spring.demo.entity.UserDO;

import java.util.List;

public interface UserDAO {

    List<UserDO> getAllUser();

    int deleteByPrimaryKey();
}
