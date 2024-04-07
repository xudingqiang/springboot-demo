package com.bella.start.sevice.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bella.start.bean.User;
import com.bella.start.dao.UserMapper;
import com.bella.start.sevice.UserService;
import org.springframework.stereotype.Service;

/**
 * @author bella
 * @since 2022/1/21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
