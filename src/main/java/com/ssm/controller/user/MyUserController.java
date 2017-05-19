package com.ssm.controller.user;

import com.ssm.service.user.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangfujie on 2017/5/19.
 */
@RestController
@RequestMapping("/user/myUser")
public class MyUserController {
    @Autowired
    private MyUserService userService;

    @RequestMapping("/login")
    public int loginCheck(String login_name , String password){

        return 1;
    }

}
