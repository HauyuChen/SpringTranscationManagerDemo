package com.chenhy.demo3;

public class AccountServiceImpl implements AccountService {
    //注入转账的DAO
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }


    @Override
    public void transfer(String out, String in, Double money) {
        accountDao.outMoney(out,money);
        int i = 1/0;    //制造异常
        accountDao.inMoney(in,money);
    }
}
