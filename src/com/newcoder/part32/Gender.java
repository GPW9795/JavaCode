package com.newcoder.part32;

public enum Gender implements Printer {

    MALE(){
        @Override
        public void print() {
            System.out.println("男生");
        }
    },
    FEMALE(){
        @Override
        public void print() {
            System.out.println("女生");
        }
    };

//    @Override
//    public void print() {
//        switch (this){
//            case MALE:
//                System.out.println("男生");
//                break;
//            case FEMALE:
//                System.out.println("女生");
//                break;
//        }
//    }
}

interface Printer {
    void print();
}
