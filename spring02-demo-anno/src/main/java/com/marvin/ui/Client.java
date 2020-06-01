
/*
 * @author: marvin
 * @software: IntelliJ IDEA
 * @file: Client.java
 * @time: 2020-05-25 14:04
 */

package com.marvin.ui;

import com.marvin.dao.AccountDao;
import com.marvin.service.AccountService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

    public static void main(String[] args) {

        // AccountServiceImpl accountService = new AccountServiceImpl();创建对象时 执行了new AccountServiceImpl()，进而调用了构造方法
        // 配置文件不用setter进行注入的话  会Exception in thread "main" java.lang.NullPointerException

        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        AccountService as  = (AccountService)ac.getBean("accountService");
        AccountDao adao = ac.getBean("accountDao",AccountDao.class);

        System.out.println(as);
        System.out.println(adao);
        as.saveAccount();

        System.out.println("------------------");
        AccountDao accountDao = ac.getBean("accountDao",AccountDao.class);
        AccountDao accountDao2 = ac.getBean("accountDao",AccountDao.class);
        System.out.println(accountDao);
        System.out.println(accountDao2);




        //--------BeanFactory----------
        /*Resource resource = new ClassPathResource("bean.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        AccountDao accountDao = factory.getBean("accountDao", AccountDao.class);
        AccountDao accountDao2 = factory.getBean("accountDao", AccountDao.class);

        System.out.println(accountDao);
        System.out.println(accountDao2);*/

    }
}

