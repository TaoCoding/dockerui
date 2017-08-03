package com.taocoding.dockerui.controller;

import com.taocoding.dockerui.dto.UserTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.taocoding.dockerui.service.UserService;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by taocoding on 17-7-27.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        UserTable user = this.userService.getUserById(userId);
        model.addAttribute("user", user);
        return "showUser";
    }
}
