package com.tester.extent.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @Author :stt
 * @Description:
 * @Date 2023/2/6   下午7:53
 */
public class TestMethodDemo {
    @Test
    public void test1(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void test2(){

        String s = new String("1"); String string = new String("2");
        Assert.assertEquals(string,s);
    }

    @Test
    public void logDemo(){
        Reporter.log("这是自己写的日志");
        throw new RuntimeException("这是自己运行时的异常");
    }

}
