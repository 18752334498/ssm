package com.yucong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yucong.model.User;
import com.yucong.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String getAll(ModelMap map) {
        List<User> list = userService.getAllUsers();
        list.forEach(System.out::println);
		System.out.println("-------------------------------");
		userService.getAllUsers();
        map.put("list", list);

        return "login";
    }
}
