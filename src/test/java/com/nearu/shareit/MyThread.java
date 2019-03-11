package com.nearu.shareit;

/**
 * @Description:
 * @Author: ZhaoZhenHua1 howard
 * @Date: 19-3-7 下午9:05
 */
public class MyThread extends Thread {
    public MyThread() {
        System.out.println("MyThread ===start===");
        System.out.println("Thread.currentThread().getName():"+Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive():"+Thread.currentThread().isAlive());
        System.out.println("this.getName():"+this.getName());
        System.out.println("this.isAlive():"+this.isAlive());
        System.out.println("MyThread ===end===");
    }

    @Override
    public void run() {
        System.out.println("run ===start===");
        System.out.println("Thread.currentThread().getName():"+Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive():"+Thread.currentThread().isAlive());
        System.out.println("this.getName():"+this.getName());
        System.out.println("this.isAlive():"+this.isAlive());
        System.out.println("run ===end===");
    }
}
