package com.qf.service;

import com.qf.entity.User;

import java.util.List;

/**
 * @Author X
 * @Date 2019/6/30 21:09
 * @Version 1.0
 **/
public interface IUserService {

    User insertUser(User user);

    List<User> queryName(String name);

    List<User> login(String username, String password);

}
