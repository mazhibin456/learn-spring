
/*
 * @author: marvin
 * @software: IntelliJ IDEA
 * @file: AccountDaoImpl.java
 * @time: 2020-05-25 14:06
 */

package com.marvin.dao.impl;

import com.marvin.dao.AccountDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {
    @Override
    public void saveAccount() {
        System.out.println("AccountDaoImpl保存账户");
    }
}
