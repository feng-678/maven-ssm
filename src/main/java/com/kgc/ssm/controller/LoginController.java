package com.kgc.ssm.controller;

import com.kgc.ssm.pojo.User;
import com.kgc.ssm.response.ResBody;
import com.kgc.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class LoginController{
    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    public ResBody<?> login(@RequestBody User user,HttpSession session){
        User u = userService.login(user.getLoginname(), user.getPassword());
        if (u != null) {
            session.setAttribute("user", u);
            return new ResBody<>("登录成功", null, 200);
        } else {
            return new ResBody<>("登录失败，用户名或密码错误", null, 200);
        }


    }
    @RequestMapping("/logout")
    public ResBody<?> logout(HttpSession session){
        session.removeAttribute("user");
        return new ResBody<>("退出成功",null,200);

    }
    @RequestMapping("/test")
    public ResBody<?> test(HttpSession session){
        Object admin = session.getAttribute("user");
        return new ResBody<>("查询成功",admin,200);
    }
    @RequestMapping("/findAll")
    public ResBody<?> findAll(User user){
        List<User> u = userService.findAll(user);
        return new ResBody<>("查询成功",u,200);

    }

}
