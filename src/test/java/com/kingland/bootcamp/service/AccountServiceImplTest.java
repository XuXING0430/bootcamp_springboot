/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.bootcamp.service;

import com.kingland.bootcamp.mapper.AccountMapper;
import com.kingland.bootcamp.domain.Account;
import com.kingland.bootcamp.service.impl.AccountServiceImpl;
import mockit.Deencapsulation;
import mockit.NonStrictExpectations;
import org.junit.Before;
import org.junit.Test;
import mockit.Mocked;
import java.util.ArrayList;
import static org.junit.Assert.assertTrue;


/**
 * Test AccountServiceImpl
 *
 * @author KSC
 *
 */

public class AccountServiceImplTest {

    private AccountServiceImpl serviceImpl;

    @Mocked
    private AccountMapper accountMapper;

    @Before
    public void setup() {
        serviceImpl = new AccountServiceImpl();
        Deencapsulation.setField(serviceImpl, "accountMapper", accountMapper);
    }

    @Test
    public void findAccountByName_correct(){
        String username = "test1";
        new NonStrictExpectations() {
            {
                Deencapsulation.invoke(accountMapper, "findAccountByName", username);
                result = new Account();
            }
        };
        Object returnObj = serviceImpl.findAccountByName(username);

        assertTrue(returnObj instanceof Account);
    }

    @Test
    public void addAccounts_correct(){
        Account testAccount = new Account();
        testAccount.setUsername("test1");
        testAccount.setPassword("12345678");

        new NonStrictExpectations() {
            {
                Deencapsulation.invoke(accountMapper, "addAccounts", testAccount);
            }
        };
         serviceImpl.addAccounts(testAccount);
    }

    @Test
    public void getAllAccounts_correct(){

        new NonStrictExpectations() {
            {
                Deencapsulation.invoke(accountMapper, "getAllAccounts");
                result = new ArrayList<Account>();
            }
        };
        Object returnObj = serviceImpl.getAllAccounts();

        assertTrue(returnObj instanceof ArrayList<?>);
    }
}
