package com.taocoding.dockerui.service.impl;

import com.taocoding.dockerui.dao.UserTableDao;
import com.taocoding.dockerui.dto.UserTable;
import com.taocoding.dockerui.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by taocoding on 17-7-27.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserTableDao userTableDao;

    public UserTable getUserById(int userId) {
        return this.userTableDao.selectByPrimaryKey(userId);
    }

}
