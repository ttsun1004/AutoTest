package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @Author :stt
 * @Description:多线程测试
 * @Date 2023/2/4   下午8:57
 */
public class MultiThreadOnAnnotion {
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id:%s%n",Thread.currentThread().getId());
    }
}
