package com.nateshao;

import java.io.IOException;

/**
 * @date Created by 邵桐杰 on 2020/8/7 21:34
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 */
/*
    jps
        -q：显示进程ID
        -m：显示进程ID，主类名称，以及传入main方法的参数
        -l：显示进程ID，主类全名
        -v：显示进程ID，主类名称，以及传入JVM的参数
        -V：显示进程ID，主类名称
 */
//-Xmn8m 指定年轻代内存大小
public class Demo01 {
    public static void main(String[] args) throws IOException {
        System.out.println("jps");
        System.in.read();

    }
}