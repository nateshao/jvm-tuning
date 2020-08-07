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
    jstack:
        -F : 当线程挂起时，使用jstack pid 请求不被响应时，强制输出线程堆栈

        -l : 除堆栈外，显示关于锁的附加信息,例如 ownable synchronizers

        -m : 可以同时输出java以及C/C++的堆栈信息

 */
public class Demo06 {
    public static void main(String[] args) throws IOException {
        System.out.println("jstack");
        System.in.read();
    }
}
