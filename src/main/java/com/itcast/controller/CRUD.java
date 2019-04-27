package com.itcast.controller;


import com.itcast.entity.User;
import com.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/CRUD")
public class CRUD {

    @Autowired
     private UserService userService;


    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public User insert(User user){
        return userService.insertUser(user);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public String delete(int id){
        int result  = userService.delete(id);
        if (result >=1){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public String update(User user){
        int result = userService.Update(user);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }

    @RequestMapping(value = "/listUser",method = RequestMethod.GET)
    public List<User> listUser(){
        return userService.ListUser();
    }

    @RequestMapping(value = "/listUserByName",method = RequestMethod.GET)
    public List<User> listUserName(String name){
        return userService.findByName(name);
    }
}


