package com.chenhl.tssm.web;

import com.chenhl.tssm.domain.User;
import com.chenhl.tssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @创建人: chenhl
 * @创建时间: 2020/2/15
 * @描述:
 */
@Controller
public class MyController {

    @Autowired
    UserService userService;

    @RequestMapping("/user/getUserById")
    @ResponseBody
    public Object getUserById(Integer id) {
        User user = userService.getById(id);
        return user;
    }
}