
/*
 * @author: marvin
 * @software: IntelliJ IDEA
 * @file: TestAop.java
 * @time: 2020-05-29 11:16
 */

package com.marvin;

import com.marvin.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    public static void main(String[] args) {
        //1.获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.获取对象
        AccountService as = (AccountService)ac.getBean("accountService");
        //3.执行方法
        as.saveAccount();
    }
}
