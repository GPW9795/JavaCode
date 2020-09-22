package com.newcoder.part30;


import com.newcoder.part30.dao.DaoFactory;
import com.newcoder.part30.dao.UserDao;
import com.newcoder.part30.dao.UserDaoJdbcImpl;
import com.newcoder.part30.util.ArrayUtil;
import com.newcoder.part30.util.Comparator;

import java.lang.reflect.Array;
import java.util.Arrays;

// 面向接口编程
public class InterfaceDemo implements Constant {

    public static void main(String[] args) {
        System.out.println(WIDTH + "*" + HEIGHT);

        UserDao dao = DaoFactory.getUserDao();
        System.out.println(dao.selectUserCount());

        int[] nums = {10, 4, 13, 1, 8}; // 按照牌面排序
        ArrayUtil.sort(nums, new ComparatorImp1());
        System.out.println(Arrays.toString(nums));
    }
}

class ComparatorImp1 implements Comparator {

    @Override
    public int compare(int m, int n) {
        if (m == n) {
            return 0;
        } else if (m == 1) {
            return 1;
        } else if (n == 1) {
            return -1;
        } else {
            return m > n ? 1 : -1;
        }
    }
}