package com.itcast.service;


import com.itcast.entity.User;
import com.itcast.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> findByName(String name){
        return userMapper.findUserByName(name);
    }

    public User insertUser(User user){
        userMapper.insertUser(user);
        return user;
    }

    public int delete(int id){
        return userMapper.delete(id);
    }

    public List<User> ListUser(){
        return userMapper.listUser();
    }

    public int Update(User user){
        return userMapper.update(user);
    }



}
