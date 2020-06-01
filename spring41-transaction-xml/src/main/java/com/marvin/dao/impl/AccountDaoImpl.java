
/*
 * @author: marvin
 * @software: IntelliJ IDEA
 * @file: AccountDaoImpl.java
 * @time: 2020-06-01 17:02
 */

package com.marvin.dao.impl;

import com.marvin.dao.AccountDao;
import com.marvin.domain.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    @Override
    public Account findAccountById(Integer id) {
        List<Account> accounts = super.getJdbcTemplate().query("select * from account where id = ?", new BeanPropertyRowMapper<>(Account.class), id);
        return accounts.isEmpty() ? null : accounts.get(0);
    }

    @Override
    public Account findAccountByName(String accountName) {
        List<Account> accounts = super.getJdbcTemplate().query("select * from account where name = ?", new BeanPropertyRowMapper<>(Account.class), accountName);
        if (accounts.isEmpty()) {
            return null;
        } else if (accounts.size() > 1) {
            throw new RuntimeException("结果不唯一");
        } else {
            return accounts.get(0);
        }
    }

    @Override
    public int updateAccount(Account account) {
        int update = super.getJdbcTemplate().update("update account set name=?,money=? where id=?", account.getName(), account.getMoney(), account.getId());
        return update;
    }
}
