package com.mypol.myproject.dao;

import com.mypol.myproject.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT id,username,age,phone,email FROM USER WHERE AGE=#{age}")
    public List<User> getUser(int age);
}
