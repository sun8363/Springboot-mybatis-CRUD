package com.itcast.controller;

import com.itcast.Application;
import com.itcast.entity.User;
import com.itcast.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)

public class CRUDTest {
    @Autowired
    private UserService userService;

    @Test
    public void insert() throws Exception {
        User user = new User();
        user.setId(6);
        user.setPassWord("1314");
        user.setRealName("111");
        user.setUserName("菜鸟2");
        try {
            userService.insertUser(user);
            System.out.println("添加用户成功");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void delete() throws Exception {

        userService.delete(6);
    }

    @Test
    public void update() throws Exception {
        User user = new User();
        user.setUserName("李娜");
        user.setRealName("爱人");
        user.setPassWord("爱你");
        user.setId(4);
        userService.Update(user);
    }

    @Test
    public void listUser() throws Exception {
        List<User> users = userService.ListUser();
        System.out.println(users);

    }

    @Test
    public void listUserName() throws Exception {

        List<User> name = userService.findByName("李娜");
        System.out.println(name);
    }

}