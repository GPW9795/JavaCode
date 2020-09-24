package com.nowcoder.chapter3.part35;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * DateFormat
 * SimpleDateFormat
 *
 * @see java.text.DateFormat
 * @see java.text.SimpleDateFormat
 */
public class BasicLibraryDemo17 {

    public static void main(String[] args) throws ParseException {
        DateFormat df;

        df = DateFormat.getDateInstance();
        System.out.println(df.format(new Date()));

        df = DateFormat.getTimeInstance();
        System.out.println(df.format(new Date()));

        df = DateFormat.getDateTimeInstance();
        System.out.println(df.format(new Date()));

        df = DateFormat.getDateInstance(DateFormat.FULL, Locale.CHINA);
        System.out.println(df.format(new Date()));

        df = DateFormat.getTimeInstance(DateFormat.FULL, Locale.CHINA);
        System.out.println(df.format(new Date()));

        df = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.CHINA);
        System.out.println(df.format(new Date()));

        System.out.println(df.parse("2020年9月24日星期四 中国标准时间 下午11:09:11"));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        System.out.println(sdf.format(new Date()));

        System.out.println(sdf.parse("2020-09-24 23:11:17.054"));
    }

}

