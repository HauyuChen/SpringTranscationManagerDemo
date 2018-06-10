package com.chenhy.demo2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/*
* Spring 声明式事务管理
* 基于 TransactionProxyFactoryBean 的事务管理
* */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContextDemo2.xml")
public class Demo2Test {
    //@Resource(name="accountService")
    @Resource(name = "accountServiceProxy")
    private AccountService accountService;

    @Test
    public void demo1(){
        accountService.transfer("UserA","UserB",100d);
    }
}
