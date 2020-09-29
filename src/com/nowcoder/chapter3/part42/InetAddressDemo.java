package com.nowcoder.chapter3.part42;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * InetAddress
 */
public class InetAddressDemo {

    public static void main(String[] args) throws IOException {
        InetAddress baidu = InetAddress.getByName("www.baidu.com");
        System.out.println(baidu.getHostAddress());
        System.out.println(baidu.isReachable(2000));

        InetAddress local = InetAddress.getByAddress(new byte[]{127,0,0,1});
        System.out.println(local.getHostName());
        System.out.println(local.isReachable(2000));
    }

}
