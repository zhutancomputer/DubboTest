package cn.zhutan.dubbo.server.service.impl;

import cn.zhutan.dubbo.api.model.User;
import cn.zhutan.dubbo.api.service.IUserService;

public class UserServiceImpl implements IUserService {
    @Override
    public User getUserById(long id) {
        return new User(1, "zhutan");
    }
}
