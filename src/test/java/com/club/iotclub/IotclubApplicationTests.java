package com.club.iotclub;

import com.club.iotclub.dao.UserMapper;
import com.club.iotclub.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;

@SpringBootTest
class IotclubApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {
    }
    @Test
    void addUser(){
        userMapper.addUser(new User(0,"B17070219","杜林超","男","物联网学院","网络工程",new Date()));
    }
}
