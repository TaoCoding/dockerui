package com.taocoding.dockerui.service;

import com.taocoding.dockerui.dto.UserTable;

/**
 * Created by taocoding on 17-7-27.
 */
public interface UserService {
    public UserTable getUserById(int userId);
}
