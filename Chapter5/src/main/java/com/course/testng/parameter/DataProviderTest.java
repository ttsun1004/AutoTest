package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * @Author :stt
 * @Description:
 * @Date 2023/2/4   下午8:37
 */
public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name="+name+";age="+age);
    }
    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] o=new Object[][]{
                {"zhangsan",10},
                {"lisi",11}
        };
        return o;
    }
    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test1111方法的name="+name+";age="+age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test22222方法的name="+name+";age="+age);
    }
    //通过方法名传递参数
    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result=null;
        if(method.getName().equals("test1")){
            result=new Object[][]{
                    {"zhangsan",10}
            };
        }else if(method.getName().equals("test2")){
            result=new Object[][]{
                    {"lisi",10}
            };
        }
        return  result;
    }

}
