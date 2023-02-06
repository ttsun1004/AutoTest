package com.course.testng;

import org.testng.annotations.Test;

/**
 * @Author :stt
 * @Description:异常测试
 * 在期望结果为异常是使用
 * 例如：传入非法数据，程序抛出异常，我们期望结果是异常
 * @Date 2023/2/4   下午1:54
 */
public class ExpectedException {
    //这是一个测试结果会失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void failedExceptionCase(){
//        int i=10;
//        int j=i/0;
        System.out.println("失败了");

    }
    //这是一个测试结果会成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void successExceptionCase(){
//        int i=10;
//        int j=i/0;
        System.out.println("成功的异常测试");
        throw new RuntimeException();

    }
}
