
/*
 * @author: marvin
 * @software: IntelliJ IDEA
 * @file: SpringTest.java
 * @time: 2020-05-26 21:45
 */

package com.marvin;

import com.marvin.domain.Account;
import com.marvin.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class SpringTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void testFindAll() {
        List<Account> accounts = accountService.findAllAccount();
        for(Account account : accounts){
            System.out.println(account);
        }
    }
}
