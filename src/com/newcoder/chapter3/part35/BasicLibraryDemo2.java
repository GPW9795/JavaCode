package com.newcoder.chapter3.part35;

import java.util.Scanner;

/**
 * 用户输入
 */
public class BasicLibraryDemo2 {

    public static void main(String[] args) {
        // main()的参数
        // java BasicLibraryDemo2 "Hello World" OK
        for (String arg : args) {
            System.out.println(arg);
        }

        // Scanner
        Scanner scanner = new Scanner(System.in);

//        while (scanner.hasNextInt()) {
//            int score = scanner.nextInt();
//            if (score < 0) {
//                break;
//            }
//            System.out.println("Now：" + score);
//        }

//        scanner.useDelimiter("\n");
//        while (scanner.hasNext()) {
//            String str = scanner.next();
//            if(str.equals("exit")){
//                break;
//            }
//            System.out.println("Now: " + str);
//        }

        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            if (str.equals("exit")) {
                break;
            }
            System.out.println("Now: " + str);
        }
        scanner.close();
    }

}
