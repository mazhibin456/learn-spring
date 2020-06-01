
/*
 * @author: marvin
 * @software: IntelliJ IDEA
 * @file: AccountServiceImpl.java
 * @time: 2020-05-25 14:08
 */

package com.marvin.service.impl;

import com.marvin.dao.AccountDao;
import com.marvin.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public AccountServiceImpl(){
        System.out.println("对象创建了");
    }


    @Override
    public void saveAccount() {
        accountDao.saveAccount();
    }
}
