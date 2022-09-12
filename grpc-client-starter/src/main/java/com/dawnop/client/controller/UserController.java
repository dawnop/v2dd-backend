package com.dawnop.client.controller;

import com.dawnop.client.entity.RespBean;
import com.dawnop.client.entity.User;
import com.dawnop.client.entity.UserLoginParam;
import com.dawnop.client.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public RespBean login(@RequestBody UserLoginParam param) {
        return userService.login(param.getUsername(), param.getPassword());
    }

    @GetMapping("/info")
    public RespBean getUserInfo(Principal principal) {
        if (principal == null) {
            return null;
        }
        String username = principal.getName();
        User user = userService.getUserByUsername(username);
        user.setPassword(null);
        return RespBean.success("check user info successfully", user);
    }

    @PostMapping("/logout")
    public RespBean logout() {
        return RespBean.success("Logout successfully");
    }


}
