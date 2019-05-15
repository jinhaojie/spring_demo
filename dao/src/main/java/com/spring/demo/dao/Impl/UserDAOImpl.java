package com.spring.demo.dao.Impl;

import com.spring.demo.dao.UserDAO;
import com.spring.demo.entity.UserDO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserDAOImpl implements UserDAO {


    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public List<UserDO> getAllUser() {
        List<UserDO> userDOS = sqlSessionTemplate.selectList("getAllUser");
        return userDOS;
    }

    @Override
    public int deleteByPrimaryKey() {
        return sqlSessionTemplate.delete("deleteByPrimaryKey", 1L);
    }

}
