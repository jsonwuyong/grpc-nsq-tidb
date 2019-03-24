package com.sunnywu.service.impl;/**
 * Created by sunny
 * 2019/3/23.
 */

import com.sunnywu.entity.User;
import com.sunnywu.mapper.UserMapper;
import com.sunnywu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author
 * @create 2019-03-23 23:29
 **/
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> queryUserInfoList() {

        List<User> userList = userMapper.queryUser();
        return userList;
    }

    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    public User queryUserById(int userId) {
        return userMapper.selectUserById(userId);
    }
}
