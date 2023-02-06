package com.course.testng.suite;

import org.testng.annotations.*;

/**
 * @Author :stt
 * @Description:用来进行所有测试套件的配置
 * 写共有的方法
 * @Date 2023/2/4   下午12:09
 */
public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite运行了");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite运行了");
    }
    @BeforeTest
    public void beforeTest(){

        System.out.println("BeforeTest运行了");
    }

    @AfterTest
    public void afterTest(){

        System.out.println("AfterTest运行了");
    }
}
