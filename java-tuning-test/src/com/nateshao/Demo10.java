package com.nateshao;

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
    jvisualvm:内存分析
 */
public class Demo10 {
    public static void main(String[] args) throws Exception{
        test1();
        System.in.read();
    }

    private static void test1() throws Exception{
        List<Student> list = new ArrayList<Student>();
        for (int i = 0; i < 100; i++) {
            Thread.sleep(1000);
            list.add(new Student());
        }

    }

}

class Student {
    private byte[] big = new byte[5 * 1024 * 1024]; //5M
}