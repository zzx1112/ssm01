package com.zzx;

import com.zzx.mapper.UserMapper;
import com.zzx.pojo.User;
import com.zzx.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Ssm01ApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        userMapper.deleteUserById(38);
    }


}
