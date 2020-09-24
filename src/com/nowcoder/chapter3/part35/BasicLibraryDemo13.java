package com.nowcoder.chapter3.part35;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * BigDecimal
 *
 * @see java.math.BigDecimal
 */
public class BasicLibraryDemo13 {

    public static void main(String[] args) {
        // double
        double d1 = 0.0005;
        double d2 = 0.0003;
        System.out.println("d1 + d2 = " + (d1 + d2));
        System.out.println("d1 - d2 = " + (d1 - d2));
        System.out.println("d1 * d2 = " + (d1 * d2));
        System.out.println("d1 / d2 = " + (d1 / d2));

        // BigDecimal
        BigDecimal d3 = new BigDecimal("0.0005");
        BigDecimal d4 = new BigDecimal("0.0003");
        System.out.println("d3 + d4 = " + d3.add(d4));
        System.out.println("d3 - d4 = " + d3.subtract(d4));
        System.out.println("d3 * d4 = " + d3.multiply(d4));
        System.out.println("d3 / d4 = " + d3.divide(d4, MathContext.DECIMAL32));

        // BigDecimal(double)
        BigDecimal d5 = new BigDecimal(0.0005);
        BigDecimal d6 = new BigDecimal(0.0003);
        System.out.println("d5 + d4 = " + d5.add(d6));
        System.out.println("d5 - d4 = " + d5.subtract(d6));
        System.out.println("d5 * d4 = " + d5.multiply(d6));
        System.out.println("d5 / d4 = " + d5.divide(d6, MathContext.DECIMAL32));

        // BigDecimal.valueOf(double)
        BigDecimal d7 = BigDecimal.valueOf(0.0005);
        BigDecimal d8 = BigDecimal.valueOf(0.0003);
        System.out.println("d7 + d8 = " + d7.add(d8));
        System.out.println("d7 - d8 = " + d7.subtract(d8));
        System.out.println("d7 * d8 = " + d7.multiply(d8));
        System.out.println("d7 / d8 = " + d7.divide(d8, MathContext.DECIMAL32));
    }

}

