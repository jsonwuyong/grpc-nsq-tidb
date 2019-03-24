package com.sunnywu.mapper;

import com.sunnywu.entity.User;

import java.util.List;

/**
 * Created by sunny
 * 2019/3/23.
 */
public interface UserMapper {

    List<User> queryUser();

    int insertUser(User user);

    User selectUserById(int userId);

}
