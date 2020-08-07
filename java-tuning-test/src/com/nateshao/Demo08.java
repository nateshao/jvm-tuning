package com.nateshao;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @date Created by 邵桐杰 on 2020/8/7 21:34
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 */
/*
    JConsole演示内存变化
*/
public class Demo08 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Thread.sleep(5000);
        System.out.println("start...");
        test1(10000);

        System.in.read();
    }

    public static void test1(int num) throws InterruptedException {
        final int _128K = 128 * 1024; //128k
        List<byte[]> list = new ArrayList<byte[]>();
        for (int i = 0; i < num; i++) {
            //稍作延时，令监视曲线的变化更加明显
            Thread.sleep(100);
            list.add(new byte[_128K]);
        }
    }
}
