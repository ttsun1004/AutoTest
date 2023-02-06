package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @Author :stt
 * @Description:
 * @Date 2023/2/4   下午1:23
 */
@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teacher1(){
        System.out.println("GroupsOnClass3的teacher1执行");
    }
    public void teacher2(){
        System.out.println("GroupsOnClass3的teacher2执行");
    }
}
