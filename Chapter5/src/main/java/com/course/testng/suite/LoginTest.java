package com.course.testng.suite;

import org.testng.annotations.Test;

/**
 * @Author :stt
 * @Description:测试类即进行逻辑控制的类
 * 写具体测试的内容，Test标签标记的方法
 * @Date 2023/2/4   下午12:10
 */
public class LoginTest {
    @Test
    public void loginSuccess(){
        System.out.println("登录成功了");
    }
}
