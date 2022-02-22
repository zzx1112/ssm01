package com.zzx.mapper;

import com.zzx.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author zzx
 * @Date 2021/7/20 14:50
 **/
@Repository
public interface UserMapper {

    List<User> getAllUser();

    User getUserById(Integer id);

    void deleteUserById(Integer id);

    void updateUserById(User user);

    void insertUser(User user);
}
