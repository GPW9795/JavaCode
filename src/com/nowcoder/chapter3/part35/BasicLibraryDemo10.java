package com.nowcoder.chapter3.part35;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Pattern类和Matcher类
 */
public class BasicLibraryDemo10 {

    public static void main(String[] args) {
        // Pattern静态方法，不方便复用
        System.out.println(Pattern.matches("^\\w{6,20}$", "nowcoder_2020"));

        // Pattern实例方法
        Pattern userPattern = Pattern.compile("^\\w{6,20}$");
        Matcher userMatcher = userPattern.matcher("nowcoder_2020@");
        System.out.println(userMatcher.matches());

        // Matcher的方法
        String str = "高价回收二手电脑,电话:13812345678,15912345678,18612345678,联系人诸葛先生!";
        String reg = "(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}";
        Matcher matcher = Pattern.compile(reg).matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }

}
