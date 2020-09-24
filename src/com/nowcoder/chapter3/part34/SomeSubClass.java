package com.nowcoder.chapter3.part34;

/**
 * 某个子类
 *
 * @author GaoPeiwen
 * @version 1.0
 * @see com.nowcoder.chapter3.part34.SomeInterface
 * @see com.nowcoder.chapter3.part34.SomeParentClass
 */
public class SomeSubClass extends SomeParentClass implements SomeInterface{

    /**
     * 宽度
     */
    public static final int WIDTH = 1024;

    /**
     * 高度
     */
    public static final int HEIGHT = 1024;

    /**
     *
     * @param str 需传入的字符串
     */
    public SomeSubClass(String str){

    }

    @Override
    public void print(String str) {

    }
}
