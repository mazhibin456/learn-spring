
/*
 * @author: marvin
 * @software: IntelliJ IDEA
 * @file: AccountServiceTest.java
 * @time: 2020-06-01 21:07
 */

package com.marvin;

import com.marvin.config.SpringConfiguration;
import com.marvin.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void test1(){
        accountService.transfer("aaa","bbb",100F);
    }

}
