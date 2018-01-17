package com.leshare.demo.dao.impl;

import com.leshare.demo.bean.*;
import com.leshare.demo.dao.UserDao;

public class UserDaoImpl implements UserDao{

  public User findUserById(int id){

    User user = new User();
    user.setId(1);
    user.setName("Mario");
    user.setAge(18);
    user.setSex("male");

    return user;
  }

}
