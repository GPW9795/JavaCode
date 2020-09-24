package com.nowcoder.chapter3.part35;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

/**
 * Calendar
 *
 * @see java.util.Calendar
 */
public class BasicLibraryDemo16 {

    public static void main(String[] args) throws ParseException {
        // now
        Calendar calendar = Calendar.getInstance();

        // Lenient,不容错模式
//        calendar.setLenient(false);

        //field
        String now = new StringBuilder()
                .append(calendar.get(Calendar.YEAR)).append("-")
                .append(calendar.get(Calendar.MONTH) + 1).append("-")
                .append(calendar.get(Calendar.DATE)).append(" ")
                .append(calendar.get(Calendar.HOUR)).append(":")
                .append(calendar.get(Calendar.MINUTE)).append(":")
                .append(calendar.get(Calendar.SECOND)).append(".")
                .append(calendar.get(Calendar.MILLISECOND)).toString();
        System.out.println(now);

        // Calendar -> Date
        System.out.println(calendar.getTime());

        calendar.setTime(new Date());
        System.out.println(calendar.getTime());

        // 2020-10-1
        calendar.set(2020, 9, 1);
        System.out.println(calendar.getTime());

        // 2020-1-31 10:10:10
        calendar.set(2020, 0, 31, 10, 10, 10);
        System.out.println(calendar.getTime());

        // MONTH -> 2, 溢出自动处理
        calendar.set(Calendar.MONTH, 1);
        System.out.println(calendar.getTime());

        // DATE -> DATE - 2
        calendar.add(Calendar.DATE, -2);
        System.out.println(calendar.getTime());
    }

}

