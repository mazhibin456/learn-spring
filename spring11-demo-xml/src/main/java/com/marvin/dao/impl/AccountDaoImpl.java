
/*
 * @author: marvin
 * @software: IntelliJ IDEA
 * @file: AccountDaoImpl.java
 * @time: 2020-05-26 21:17
 */

package com.marvin.dao.impl;

import com.marvin.dao.AccountDao;
import com.marvin.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class AccountDaoImpl implements AccountDao {

    private QueryRunner runner;

    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }


    @Override
    public List<Account> findAllAccount()  {
        try {
            return runner.query("select * from account",new BeanListHandler<Account>(Account.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Account findById(Integer id) {
        try{
            return runner.query("select * from account where id = ? ",new BeanHandler<Account>(Account.class),id);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int saveAccount(Account account) {
        try{
            return runner.update("insert into account(name,money)values(?,?)",account.getName(),account.getMoney());
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int updateAccount(Account account) {
        try{
            return runner.update("update account set name=?,money=? where id=?",account.getName(),account.getMoney(),account.getId());
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int deleteAccount(Integer id) {
        try{
            return runner.update("delete from account where id=?",id);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



}
