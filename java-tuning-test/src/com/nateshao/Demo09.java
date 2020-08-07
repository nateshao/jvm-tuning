package com.nateshao;

import java.io.IOException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @date Created by 邵桐杰 on 2020/8/7 21:34
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 */
/*
    JConsole演示线程监控
*/
public class Demo09 {
    public static void main(String[] args) throws IOException {
        System.in.read();
        System.out.println("开启了死循环线程");
        whileTrueThread();

        System.in.read();
        System.out.println("开启了等待线程");
        waitThread(new Object());


        System.in.read();
        System.out.println("开启了死锁线程");
        deadLock();

        System.in.read();
    }

    private static void whileTrueThread() {
        new Thread(() -> {
            while (true) ;
        }, "whileTrueThread").start();
    }

    private static void waitThread(Object o) {
        new Thread(() -> {
            synchronized (o) {
                try {
                    o.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"myWaited").start();
    }

    private static void deadLock() {
        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();
        new Thread(() -> {
            try {
                lock1.lock();
                Thread.sleep(100);
                lock2.lock();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "myThread1").start();
        new Thread(() -> {
            try {
                lock2.lock();
                Thread.sleep(100);
                lock1.lock();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "myThread2").start();
    }
}
