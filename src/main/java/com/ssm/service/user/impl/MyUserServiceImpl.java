package com.ssm.service.user.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.common.entity.MyUser;
import com.common.mapper.MyUserMapper;
import com.ssm.dao.user.MyUserDao;
import com.ssm.service.user.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wangfujie on 2017/5/19.
 */
@Service
public class MyUserServiceImpl extends ServiceImpl<MyUserMapper, MyUser> implements MyUserService {
    @Autowired
    private MyUserDao userDao;

}
