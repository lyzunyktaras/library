package com.web.club3.controller;

import com.web.club3.model.Role;
import com.web.club3.model.User;
import com.web.club3.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class UserController {

    private UserServiceImpl userService;

    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String greeting() {
        return "home";
    }

    @GetMapping("/auth")
    public String registration(Model model) {
        model.addAttribute("userForm", new User());
        return "auth";
    }

    @PostMapping("/auth")
    public String addUser(@ModelAttribute("userForm") User user) {
        userService.create(user);
        return "redirect:/";
    }

}
