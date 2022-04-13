package com.fish.oa.dao;

import com.fish.oa.entity.User;
import com.fish.oa.utils.MybatisUtils;

public class UserDao {
    /**
     * 按用户名查询 用户表
     * username 用户名
     * @return User对象包含对应的用户信息,null则代表对象不存在
     */
    public User selectByUsername(String username){
        User user = (User)MybatisUtils.executeQuery(sqlSession -> sqlSession.selectOne("usermapper.selectByUsername" , username));
        return user;
    }
}