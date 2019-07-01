package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.EMail;
import com.qf.entity.User;
import com.qf.service.IEMailService;
import com.qf.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author X
 * @Date 2019/6/30 22:10
 * @Version 1.0
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    @Reference
    private IUserService userService;

    @Reference
    private IEMailService eMailService;

    @RequestMapping("/toregister")
    public String toRegister(Model model, EMail eMail){
        EMail id = eMailService.getById(eMail.getId());
        model.addAttribute("id",id);
        return "register";
    }

    @RequestMapping("/register")
    public String register(User user, String code, HttpServletRequest request, HttpServletResponse response, Model model){
        String name = String.valueOf(userService.queryName(user.getName()).get(0));
        if (name != null) {

            request.setAttribute("user", "该用户已存在,请重新注册");
            return "register";

        } else {
            userService.insertUser(user);
            request.getSession().setAttribute("user", user);
        }
        return "index";
    }

    @RequestMapping("/login")
    public String login(String name,String password,HttpServletRequest request){
        User user = (User) userService.login(name, password);
        if (user == null) {
            return "login";
        }
        //登录成功
        request.getSession().setAttribute("user", user);
        return "suess";
    }

}
