package com.newcoder.chapter3.part35;

/**
 * 包装类
 */
public class BasicLibraryDemo4 {

    public static void main(String[] args) {
        // 1.5以前
        Integer oi = new Integer(1);
        Character oc = new Character('A');

        int i = oi.intValue();
        char c = oc.charValue();

        System.out.println(i);
        System.out.println(c);

        // 自动装箱
        Double od = 3.14;
        Boolean ob = true;
        // 自动拆箱
        double d = od;
        boolean b = ob;

        System.out.println(d);
        System.out.println(b);

        // 字符串转为基本类型
        double dd = Double.parseDouble("1.23");
        boolean bb = Boolean.parseBoolean("true");

        System.out.println(dd);
        System.out.println(bb);

        int ii = new Integer("100");
        float ff = new Float("7.89");

        System.out.println(ii);
        System.out.println(ff);

        // 基本类型转为字符串
        String s1 = String.valueOf(1);
        String s2 = String.valueOf('c');

        System.out.println(s1);
        System.out.println(s2);

        // 比较两个值
        System.out.println(Boolean.compare(true, false));
        System.out.println(Character.compare('a', 'd'));
        System.out.println(Integer.compare(100, 200));
        System.out.println(Double.compare(100.0, 100.0));

    }

}
