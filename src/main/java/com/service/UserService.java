package com.service;

import com.entity.UserBean;

import java.util.List;

public interface UserService {
    UserBean getlogin(UserBean user);

    List<UserBean> findAll();
}
