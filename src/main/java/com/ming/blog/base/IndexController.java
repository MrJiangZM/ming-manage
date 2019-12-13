package com.ming.blog.base;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Title: LoginController
 * @Description:
 * @author: youqing
 * @version: 1.0
 * @date: 2018/11/20 11:39
 */
@Slf4j
@Controller
public class IndexController {


    @GetMapping("/login")
    public String tologin(){
        log.info("定向登陆页");
        return "login";
    }

    @GetMapping("home")
    public String home(){
        log.info("定向主页");
        return "home";
    }

    @GetMapping("logout")
    public String logout(){
        log.info("退出系统");
//        Subject subject = SecurityUtils.getSubject();
//        subject.logout(); // shiro底层删除session的会话信息
        return "redirect:login";
    }

}
