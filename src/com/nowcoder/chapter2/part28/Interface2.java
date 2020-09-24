package com.nowcoder.chapter2.part28;

public interface Interface2 {

    default int max(int x, int y) {
        return x > y ? x : y;
    }

    static int min(int x, int y) {
        return x < y ? x : y;
    }
}
