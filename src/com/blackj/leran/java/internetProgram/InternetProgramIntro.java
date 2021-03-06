package com.blackj.leran.java.internetProgram;

/**
 * Program Name: java-basic
 * <p>
 * Description: java 网络编程介绍
 * <p>
 * Created by Zhang.Haixin on 2018/11/8
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public class InternetProgramIntro {

    /**
     * java 网络编程是指多个设备之间通过网络进行通讯
     * 网络编程分为两种：Socket 编程和URL 处理 ,使用最广泛的是Socket 编程
     * java 网络编程相关的类和接口都在java.net 包中
     * java.net 包中提供了两种常见的网络协议的支持：
     *      TCP：TCP 是传输控制协议的缩写，它保障了两个应用程序之间的可靠通信。通常用于互联网协议，被称 TCP / IP
     *      UDP：UDP 是用户数据报协议的缩写，一个无连接的协议。提供了应用程序之间要发送的数据的数据包
     */
    public static void main(String [] args) {

        /**
         * 两台计算机之间使用Socket套接字建立TCP连接时通信过程：
         *  服务器实例化一个 ServerSocket 对象，表示通过服务器上的端口通信
         *  服务器调用 ServerSocket 类的 accept() 方法，该方法将一直等待，直到客户端连接到服务器上给定的端口
         *  服务器正在等待时，一个客户端实例化一个 Socket 对象，指定服务器名称和端口号来请求连接
         *  Socket 类的构造函数试图将客户端连接到指定的服务器和端口号。如果通信被建立，则在客户端创建一个 Socket 对象能够与服务器进行通信。
         *  在服务器端，accept() 方法返回服务器上一个新的 socket 引用，该 socket 连接到客户端的 socket
         */
        System.out.println("TCP 是一个双向的通信协议，因此数据可以通过两个数据流在同一时间发送.以下是一些类提供的一套完整的有用的方法来实现 socket");

        System.out.println();

        System.out.println("Socket 通信示例查看SocketServer 和 SocketClient 两个类");

        System.out.println();

        System.out.println("UDP 通信示例查看DatagramSocketServer 和 DatagramSocketClient 两个类");
    }
}
