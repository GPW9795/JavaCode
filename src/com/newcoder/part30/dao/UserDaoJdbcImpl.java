package com.newcoder.part30.dao;

public class UserDaoJdbcImpl implements UserDao{

    @Override
    public int selectUserCount() {
        System.out.println("通过JDBC查询用户数量");
        return 100;
    }

}
