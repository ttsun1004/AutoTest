package com.course.testng;

import org.testng.annotations.Test;

/**
 * @Author :stt
 * @Description:忽略测试练习
 * 通过在注解后加参数控制：(enabled = false)不执行、(enabled = true)执行，不写此参数默认执行
 * @Date 2023/2/4   下午12:40
 */
public class IgnoreTest {
    @Test
    public void ignoreCase1(){
        System.out.println("ignoreCase1 执行了");
    }
    @Test(enabled = false)
    public void ignoreCase2(){
        System.out.println("ignoreCase2 执行了");
    }
    @Test(enabled = true)
    public void ignoreCase3(){
        System.out.println("ignoreCase3 执行了");
    }

}
