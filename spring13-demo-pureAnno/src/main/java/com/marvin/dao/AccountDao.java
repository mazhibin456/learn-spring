
/*
 * @author: marvin
 * @software: IntelliJ IDEA
 * @file: AccountDao.java
 * @time: 2020-05-26 21:14
 */

package com.marvin.dao;

import com.marvin.domain.Account;

import java.util.List;

public interface AccountDao {

    List<Account> findAllAccount();

    Account findById(Integer id);

    int saveAccount(Account account);

    int updateAccount(Account account);

    int deleteAccount(Integer id);


}
