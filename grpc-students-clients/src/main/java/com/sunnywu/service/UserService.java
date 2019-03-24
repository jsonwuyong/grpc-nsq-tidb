package com.sunnywu.service;

import com.sunnywu.entity.User;

import java.util.List;

/**
 * Created by sunny
 * 2019/3/23.
 */
public interface UserService {

    List<User> queryUserInfoList();

    int insertUser(User user);

    User queryUserById(int userId);

}
