package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @Author :stt
 * @Description:
 * @Date 2023/2/4   下午9:03
 */
public class MultiThreadOnXml {
    @Test
    public void test1(){
        System.out.printf("test1 Thread Id:%s%n",Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.printf("test2 Thread Id:%s%n",Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.printf("test3 Thread Id:%s%n",Thread.currentThread().getId());
    }
    @Test
    public void test4(){
        System.out.printf("test4 Thread Id:%s%n",Thread.currentThread().getId());
    }
}
