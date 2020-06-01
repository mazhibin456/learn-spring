
/*
 * @author: marvin
 * @software: IntelliJ IDEA
 * @file: AccountServiceImpl.java
 * @time: 2020-05-25 14:08
 */

package com.marvin.service.impl;

import com.marvin.dao.AccountDao;
import com.marvin.service.AccountService;

public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public AccountServiceImpl(){
        System.out.println("对象创建了");
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void saveAccount() {
        accountDao.saveAccount();
    }
}
