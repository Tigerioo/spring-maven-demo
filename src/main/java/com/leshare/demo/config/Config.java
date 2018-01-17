package com.leshare.demo.config;

import org.springframework.context.annotation.*;
import com.leshare.demo.dao.UserDao;
import com.leshare.demo.dao.impl.UserDaoImpl;

@Configuration
public class Config {

  @Bean
  public UserDao userDao(){
    return new UserDaoImpl();
  }

}
