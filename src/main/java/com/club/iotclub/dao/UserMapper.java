package com.club.iotclub.dao;

import com.club.iotclub.pojo.User;
import org.apache.ibatis.annotations.Mapper;

public interface UserMapper {
    int addUser(User user);
}
