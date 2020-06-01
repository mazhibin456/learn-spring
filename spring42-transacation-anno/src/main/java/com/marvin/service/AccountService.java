
/*
 * @author: marvin
 * @software: IntelliJ IDEA
 * @file: AccountService.java
 * @time: 2020-06-01 20:52
 */

package com.marvin.service;

import com.marvin.domain.Account;

public interface AccountService {
    Account findAccountById(Integer accountId);

    void transfer(String sourceName, String targetName, Float money);

}
