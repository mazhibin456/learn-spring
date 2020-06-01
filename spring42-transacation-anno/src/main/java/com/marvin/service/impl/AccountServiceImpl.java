
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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService")
@Transactional(propagation= Propagation.SUPPORTS,readOnly=true)//只读型事务的配置
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public Account findAccountById(Integer accountId) {
        return accountDao.findAccountById(accountId);
    }

    @Transactional(propagation= Propagation.REQUIRED,readOnly=false)
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
