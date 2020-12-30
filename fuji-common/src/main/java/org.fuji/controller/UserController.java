package org.fuji.controller;

import org.fuji.entity.User;
import org.fuji.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author Nick
 * @CreateTime 2020/10/4
 */
@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/getUserById")
    @ResponseBody
    public User getUserByID(String id) {
        return userService.getUserById(id);
    }
}
