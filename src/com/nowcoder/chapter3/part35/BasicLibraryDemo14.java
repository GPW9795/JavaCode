package com.nowcoder.chapter3.part35;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * NumberFormat
 *
 * @see java.text.NumberFormat
 */
public class BasicLibraryDemo14 {

    public static void main(String[] args) throws ParseException {
        NumberFormat format;

        // 通用数值
        format = NumberFormat.getNumberInstance();
        System.out.println(format.format(1234567.89));

        format = NumberFormat.getNumberInstance(Locale.US);
        System.out.println(format.format(1234567.89));

        System.out.println(format.parse("1,234,567.89"));

        // 货币数值
        format = NumberFormat.getCurrencyInstance();
        System.out.println(format.format(1234567.89));

        format = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(format.format(1234567.89));

        System.out.println(format.parse("$1,234,567.89"));

        // 百分比数值
        format = NumberFormat.getPercentInstance();
        System.out.println(format.format(1234567.89));

        format = NumberFormat.getPercentInstance(Locale.US);
        System.out.println(format.format(1234567.89));

        System.out.println(format.parse("123,456,789%"));

    }

}

