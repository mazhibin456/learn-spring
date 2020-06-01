
/*
 * @author: marvin
 * @software: IntelliJ IDEA
 * @file: AccountServiceImpl.java
 * @time: 2020-06-01 20:55
 */

package com.marvin.service.impl;

import com.marvin.dao.AccountDao;
import com.marvin.domain.Account;
import com.marvin.service.AccountService;

public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public Account findAccountById(Integer accountId) {
        return accountDao.findAccountById(accountId);
    }

    @Override
    public void transfer(String sourceName, String targetName, Float money) {

         Account sourceAccout = accountDao.findAccountByName(sourceName);
         Account targetAccount = accountDao.findAccountByName(targetName);

        sourceAccout.setMoney(sourceAccout.getMoney() - money);
        targetAccount.setMoney(targetAccount.getMoney() + money);

        accountDao.updateAccount(sourceAccout);
        int i=1/0;
        accountDao.updateAccount(targetAccount);

    }
}
