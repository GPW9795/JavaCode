package com.nowcoder.chapter3.part39;

import java.io.*;

/**
 * 转换流
 */
public class IODemo6 {

    public static void main(String[] args) {
        try (
                InputStreamReader r = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(r);
        ) {
            String line = null;
            while ((line = br.readLine()) != null) {
                if (line.equalsIgnoreCase("exit")) {
                    break;
                }
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
