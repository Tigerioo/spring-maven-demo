package com.leshare.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.leshare.demo.config.Config;
import com.leshare.demo.dao.UserDao;
import com.leshare.demo.bean.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        UserDao userDao = (UserDao)context.getBean("userDao");
        User user = userDao.findUserById(1);
        System.out.println(user);
    }
}
