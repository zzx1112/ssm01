package com.zzx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zzx
 * @Date 2022/2/26 9:13
 **/
@RestController
public class LoginController {

    @GetMapping("/login")
    public String toLogin(){
        return "login";
    }
}
