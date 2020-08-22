package com.codegym.controllers;

import com.codegym.model.Login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @GetMapping("/home")
    public ModelAndView home() {
        Object modelObject;
        ModelAndView modelAndView = new ModelAndView("home", "login", new Login());
        return modelAndView;
    }
}
