package com.nowcoder.chapter3.part35;

import java.text.ParseException;
import java.util.Date;

/**
 * Date
 *
 * @see java.util.Date
 */
public class BasicLibraryDemo15 {

    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();
        System.out.println(d1.getTime());

        Date d2 = new Date(System.currentTimeMillis() + 1000);
        System.out.println(d2.getTime());

        System.out.println(d1.after(d2));
        System.out.println(d1.before(d2));
        System.out.println(d1.compareTo(d2));

        d2.setTime(d2.getTime() + 1000);
        System.out.println(d2.getTime());

    }

}

