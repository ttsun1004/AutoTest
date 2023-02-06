package com.course.testng;

import org.testng.annotations.*;

/**
 * @Author :stt
 * @Description:testng基本注解学习
 * @Date 2023/2/4   上午11:38
 */
public class BasicAnnotation {
    /*
     *@Author: suntingting
     *@Date 2023/2/4 上午11:43
     *@params
        * @param null
     *@Description:
     *@methodName
     */
    //@Test最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("Test这是测试用例1");

    }
    @Test
    public void testCase2(){
        System.out.println("Test这是测试用例2");
    }
    //在每个Test标记的方法之前运行
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod这是在测试方法之前运行的方法");
    }
    //在每个Test标记的方法之后运行
    @AfterMethod
    public void afterMethod(){

        System.out.println("AfterMethod这是在测试方法之后运行的方法");
    }
    //在类运行前运行，用于注册对象，静态赋值用于初始化操作，供其他方法使用
    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass这是在类运行前运行的方法");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass这是在类运行前运行的方法");
    }
    //在包裹的方法运行前运行的，将beforeClass包裹起来
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite测试套件");
    }

}
