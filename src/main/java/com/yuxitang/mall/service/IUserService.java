package com.yuxitang.mall.service;

import com.yuxitang.mall.pojo.User;
import com.yuxitang.mall.vo.ResponseVo;

/**
 * Created by yuxitang
 */
public interface IUserService {

    /**
     * 注册
     */
    ResponseVo<User> register(User user);

    /**
     * 登录
     */
    ResponseVo<User> login(String username, String password);
}