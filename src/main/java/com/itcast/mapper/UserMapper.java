package com.itcast.mapper;

import com.itcast.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
public interface UserMapper {

        List<User> findUserByName(String name);

        public List<User> listUser();

        public int insertUser(User user);

        public int delete(int id);

        public int  update(User user);


}
