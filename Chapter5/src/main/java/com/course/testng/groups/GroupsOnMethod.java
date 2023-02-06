package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @Author :stt
 * @Description:分组测试
 * 组属性(groups = "")在注解后，将方法分组
 * @Date 2023/2/4   下午12:47
 */
public class GroupsOnMethod {
    @Test(groups = "client")
    public void test1(){
        System.out.println("client组的 test1 执行了");
    }
    @Test(groups = "client")
    public void test2(){
        System.out.println("client组的 test2 执行了");
    }
    @Test(groups = "server")
    public void test3(){
        System.out.println("server组的 test3 执行了");
    }
    @Test(groups = "server")
    public void test4(){
        System.out.println("server组的 test4 执行了");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("client组运行前执行的方法");
    }
    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("server组运行前执行的方法");
    }
}
