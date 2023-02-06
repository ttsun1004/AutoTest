package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @Author :stt
 * @Description:
 * @Date 2023/2/4   下午1:23
 */
@Test(groups = "stu")
public class GroupsOnClass2 {

    public void stu1(){
        System.out.println("GroupsOnClass2的stu1执行");
    }
    public void stu2(){
        System.out.println("GroupsOnClass2的stu2执行");
    }
}
