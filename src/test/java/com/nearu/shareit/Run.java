package com.nearu.shareit;

/**
 * @Description:
 * @Author: ZhaoZhenHua1 howard
 * @Date: 19-3-7 下午9:10
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread);
        System.out.println("main ===start=== t1 isAlive:"+t1.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println("main ===end=== t1 isAlive:"+t1.isAlive());
    }
}
