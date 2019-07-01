package com.qf.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qf.dao.IUserMapper;
import com.qf.entity.User;
import com.qf.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author X
 * @Date 2019/6/30 21:11
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserMapper userMapper;

    @Override
    public User insertUser(User user) {
        userMapper.insert(user);
        return user;
    }

    @Override
    public List<User> queryName(String name) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("name",name);
        return userMapper.selectList(queryWrapper);
    }

    @Override
    public List<User> login(String name, String password) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("name",name);
        queryWrapper.eq("password",password);
        return userMapper.selectList(queryWrapper);
    }
}
