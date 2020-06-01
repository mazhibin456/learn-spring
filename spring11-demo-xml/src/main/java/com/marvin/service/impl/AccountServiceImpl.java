
/*
 * @author: marvin
 * @software: IntelliJ IDEA
 * @file: AccountServiceImpl.java
 * @time: 2020-05-26 21:39
 */

package com.marvin.service.impl;

import com.marvin.dao.AccountDao;
import com.marvin.domain.Account;
import com.marvin.service.AccountService;

import java.util.List;

public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    @Override
    public Account findById(Integer id) {
        return accountDao.findById(id);
    }

    @Override
    public int saveAccount(Account account) {
        return accountDao.saveAccount(account);
    }

    @Override
    public int updateAccount(Account account) {
        return accountDao.updateAccount(account);
    }

    @Override
    public int deleteAccount(Integer id) {
        return accountDao.deleteAccount(id);
    }
}
