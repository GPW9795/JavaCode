package com.newcoder.chapter2.part32;

public enum Status {

    ON() {
        @Override
        public void print() {
            System.out.println("ON!!!");
        }
    },
    OFF() {
        @Override
        public void print() {
            System.out.println("OFF!!!");
        }
    };

    public abstract void print();

}
