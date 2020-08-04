/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.bootcamp;

import com.kingland.bootcamp.dao.AccountDao;
import com.kingland.bootcamp.domian.Account;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author KSC
 *
 * Test Database Connection.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class DatabaseConnectionTest {

    @Autowired
    private AccountDao accountDao;

    @Test
    public void testDao(){

        Account testAccount = accountDao.findAccountByName("livepool");
        Assert.assertEquals(testAccount.getPassword(), "18942020");
    }
}
