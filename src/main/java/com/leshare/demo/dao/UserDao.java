package com.leshare.demo.dao;

import com.leshare.demo.bean.User;

public interface UserDao {

  /**
  * find user by id
  **/
  User findUserById(int id);

}
