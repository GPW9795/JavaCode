package com.newcoder.chapter2.part30.dao;

// 工厂模式
public class DaoFactory {

    // 静态是因为调用时前面加上类名即可，不需要new
    public static UserDao getUserDao(){
        return new UserDaoJdbcImpl();
    }
}
