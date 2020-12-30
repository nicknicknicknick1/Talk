package org.fuji.service.impl;

import org.fuji.entity.User;
import org.fuji.mapper.UserMapper;
import org.fuji.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Author Nick
 * @CreateTime 2020/10/4
 */
@Service
public class UserServiceImpl implements UserService {
    
    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public User getUserById(String id) {
        return userMapper.getUserById(id);
    }

}
