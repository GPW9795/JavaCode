package com.nowcoder.chapter3.part36;

import java.util.Scanner;

/**
 * 抛出异常
 */
public class ExceptionDemo4 {

    public static void main(String[] args) {
        try {
            String username = inputUsername();
            System.out.println(username);
        } catch (UsernameException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String inputUsername() throws UsernameException {
        System.out.println("请输入账号: ");
        try (
                Scanner scanner = new Scanner(System.in);
        ) {
            String username = scanner.nextLine();
            if (!username.matches("^\\w{6,20}$")) {
                throw new UsernameException("账号格式错误");
            }
            return username;
        } catch (RuntimeException e) {
            throw new UsernameException("输入账号失败！", e);
        }
    }
}

class UsernameException extends Exception {
    public UsernameException() {
        super();
    }

    public UsernameException(String message) {
        super(message);
    }

    public UsernameException(String message, Throwable cause) {
        super(message, cause);
    }
}