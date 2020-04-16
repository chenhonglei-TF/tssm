package com.chenhl.tssm.service.impl;

import com.chenhl.tssm.domain.User;
import com.chenhl.tssm.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @创建人: chenhl
 * @创建时间: 2020/2/15
 * @描述:
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getById(Integer id) {
        System.out.println("id="+id);
        User user = new User();
        user.setId(id);
        user.setName("张三");
        user.setAge(18);
        return user;
    }
}
