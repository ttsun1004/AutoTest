package com.course.testng;

import org.testng.annotations.Test;

/**
 * @Author :stt
 * @Description:依赖测试
 * 依赖的方法全部执行成功后才能执行测试方法,被依赖的方法执行失败，则依赖方法忽略不执行
 * @Date 2023/2/4   下午6:54
 */
public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
}
