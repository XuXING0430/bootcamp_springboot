/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.bootcamp.basic;

import com.kingland.bootcamp.SecurityApplication;
import com.kingland.bootcamp.mapper.AccountMapper;
import com.kingland.bootcamp.domain.Account;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Test Database Connection.
 *
 * @author KSC
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SecurityApplication.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class DatabaseConnectionTest {

    @Autowired
    private AccountMapper accountMapper;

    /**
     * Test the database connect
     */
    @Test
    public void testDBConnection() {
        Account testAccount = accountMapper.findAccountByName("livepool");
        Assert.assertEquals(testAccount.getPassword(), "MTg5NDIwMjA=");
    }
}
