package com.ssm.controller.user;

import com.ssm.service.user.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangfujie on 2017/5/19.
 */
@RestController
@RequestMapping("/user/myUser")
public class MyUserController {
    @Autowired
    private MyUserService userService;

    @RequestMapping("/login")
    public int loginCheck(HttpServletRequest request, String login_name, String password){
        HttpSession session = request.getSession();
        Map<String, Object> userMap = new HashMap();
        userMap.put("role_name", "张三");
        userMap.put("sex", "男");
        session.setAttribute("user",userMap);
        return 1;
    }

}
