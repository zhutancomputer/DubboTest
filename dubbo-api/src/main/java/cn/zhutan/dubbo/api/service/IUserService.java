package cn.zhutan.dubbo.api.service;

import cn.zhutan.dubbo.api.model.User;

public interface IUserService {
    User getUserById(long id);
}
