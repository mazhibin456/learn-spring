
/*
 * @author: marvin
 * @software: IntelliJ IDEA
 * @file: AccountService.java
 * @time: 2020-05-26 21:38
 */

package com.marvin.service;

import com.marvin.domain.Account;

import java.util.List;

public interface AccountService {

    List<Account> findAllAccount();

    Account findById(Integer id);

    int saveAccount(Account account);

    int updateAccount(Account account);

    int deleteAccount(Integer id);
}
