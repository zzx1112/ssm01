package com.zzx.controller;

import com.zzx.pojo.User;
import com.zzx.service.UserService;
import com.zzx.utils.ResultObj;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author zzx
 * @Date 2021/7/20 14:44
 **/
@Api(value = "用户信息")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @ApiOperation(value = "获取全部用户信息", httpMethod = "GET")
    @GetMapping("/")
    public List<User> getAllUser() {
        List<User> users = userService.getAllUser();
        return users;
    }

    @ApiOperation(value = "根据ID查询用户信息", notes = "查询数据库中的信息", httpMethod = "GET")
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id) {
        User user = userService.getUserById(id);
        return user;
    }
    @ApiOperation(value = "根据ID查询用户信息并修改", notes = "查询数据库中的信息", httpMethod = "PUT")
    @PutMapping("/{id}")
    public ResultObj updateUserById(@RequestBody User user, @PathVariable Integer id) {
        try {
            System.out.println(user);
            userService.updateUserById(user);
            return new ResultObj(200, "修改成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultObj(-1, "修改失败！");
        }
    }
    @ApiOperation(value = "根据ID查询用户信息并删除", notes = "查询数据库中的信息", httpMethod = "DELETE")
    @DeleteMapping("/{id}")
    public ResultObj deleteUserById(@PathVariable Integer id) {
        try {
            userService.deleteUserById(id);
            return new ResultObj(200, "删除成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultObj(-1, "删除失败！");
        }
    }
    @ApiOperation(value = "新增用户信息", notes = "存入数据库中的信息", httpMethod = "POST")
    @PostMapping("/")
    public ResultObj insertUser(@RequestBody User user) {
        try {
            userService.insertUser(user);
            return new ResultObj(200, "添加成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultObj(-1, "添加失败！");
        }
    }
}
