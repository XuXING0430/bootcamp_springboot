/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.bootcamp;

import com.kingland.bootcamp.mapper.AccountMapper;
import com.kingland.bootcamp.domain.Account;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author KSC
 *
 * Test Database Connection.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SecurityApplication.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)

public class DatabaseConnectionTest {

    @Autowired
    private AccountMapper accountMapper;

    @Test
    public void testAccountDao(){

        Account testAccount = accountMapper.findAccountByName("livepool");
        Assert.assertEquals(testAccount.getPassword(), "MTg5NDIwMjA=");
    }

    @Test
    public void testfindAll(){

        List<Account> allAccounts = accountMapper.getAllAccounts();

        for (Account allAccount : allAccounts) {
            System.out.println(allAccount.toString());
        }
    }

}
