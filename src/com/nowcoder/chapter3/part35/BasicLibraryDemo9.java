package com.nowcoder.chapter3.part35;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * String与正则表达式
 */
public class BasicLibraryDemo9 {

    public static void main(String[] args) {
        // matches()
        String user = "nowcoder_2020";
        String userReg = "^\\w{6,20}$";
        System.out.println(user.matches(userReg));

        // split()
        String paragraph = "How are you!\n" +
                "I'm fine, thank you, and you?\n" +
                "I'm fine too!";
        String paragraphReg = "\\s";
        String[] words = paragraph.split(paragraphReg);
        System.out.println(Arrays.toString(words));

        // replaceFirst(), replaceAll()
        String discuss =
                "淘宝店铺https://www.taobao.com/xxx/123," +
                        "京东店铺https://www.jd.coom/xxx/456";
        String discussReg = "https?://([\\w-]+\\.)+[\\w-]+(/[\\w-./?%&=]*)?";
        System.out.println(discuss.replaceFirst(discussReg,"***"));
        System.out.println(discuss.replaceAll(discussReg,"***"));
    }

}
