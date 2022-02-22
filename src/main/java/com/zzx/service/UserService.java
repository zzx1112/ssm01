package com.zzx.service;

import com.zzx.pojo.User;

import java.util.List;

/**
 * @Author zzx
 * @Date 2021/7/20 14:47
 **/
public interface UserService {

    List<User> getAllUser();

    User getUserById(Integer id);

    void deleteUserById(Integer id);


    void updateUserById(User user);

    void insertUser(User user);

}
