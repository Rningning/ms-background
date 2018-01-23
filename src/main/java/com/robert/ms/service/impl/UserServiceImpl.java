package com.robert.ms.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.robert.ms.domain.User;
import com.robert.ms.mapper.UserMapper;
import com.robert.ms.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author robert
 * @since 2018-01-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
