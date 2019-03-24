package com.sunnywu.service.impl;


import com.sunnywu.entity.User;
import com.sunnywu.service.UserService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by sunny
 * 2019/3/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @org.junit.Test
    public void queryUserInfoList() {
        List<User> userList = userService.queryUserInfoList();
        System.out.println(userList.size());
    }

    @org.junit.Test
    public void insertUser() {
        User user = new User();
        user.setUserName("wuyong");
        user.setUserAge(23);
        user.setMobile("1236484");
        user.setAddress("上海市");
        userService.insertUser(user);
    }

    @org.junit.Test
    public void queryUserById() {
        User user = userService.queryUserById(5);
        System.out.println("姓名:"+user.getUserName());
    }
}
