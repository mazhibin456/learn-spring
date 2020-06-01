
/*
 * @author: marvin
 * @software: IntelliJ IDEA
 * @file: AccountDao.java
 * @time: 2020-06-01 16:59
 */

package com.marvin.dao;

import com.marvin.domain.Account;

public interface AccountDao {
    Account findAccountById(Integer id);

    Account findAccountByName(String accountName);

    int updateAccount(Account account);
}
