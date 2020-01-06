package com.funtl.spring.security.oauth2.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author songtao
 * @create 2020-01-2020/1/6-23:33
 */

@Controller
public class BaseMainController {

    @GetMapping("/auth/login")
    public String loginPage(Model model){

        model.addAttribute("loginProcessUrl","/auth/authorize");

        return "base-login";
    }
}

