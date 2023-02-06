package com.course.testng;

import org.testng.annotations.Test;

/**
 * @Author :stt
 * @Description:超时测试
 * (timeOut = 3000)超过指定值为失败，未超过为成功
 * 运用场景：多少秒不处理 处理下一条用例
 * @Date 2023/2/4   下午9:25
 */
public class TimeOutTest {
    @Test(timeOut = 3000)//单位为毫秒
    public void testSucess() throws InterruptedException {
        Thread.sleep(4000);

    }
}
