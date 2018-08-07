package com.pack.service.impI;

import com.pack.mapper.UserMapper;
import com.pack.po.User;
import com.pack.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName UserServiceImpI
 * @Description TODO
 * @Author zhaohongwei
 * @Date 2018/8/7 14:17
 * @Version 1.0
 **/
@Service(value = "userService")
public class UserServiceImpI implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    @Transactional(readOnly = true,propagation = Propagation.REQUIRED)
    public List<User> queryUser() {
        return userMapper.selectUserAll();
    }
}
