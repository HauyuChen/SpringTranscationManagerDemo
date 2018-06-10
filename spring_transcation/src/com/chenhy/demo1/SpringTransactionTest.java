package com.chenhy.demo1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/*
* Spring 编程式事务管理
* */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContextDemo1.xml")
public class SpringTransactionTest {
    @Resource(name="accountService")
    private AccountService accountService;

    @Test
    public void demo1(){
        accountService.transfer("UserA", "UserB", 100d);
    }
}
