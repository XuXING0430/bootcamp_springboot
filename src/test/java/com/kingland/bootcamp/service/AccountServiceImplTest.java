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
<<<<<<< HEAD

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

=======
import java.util.ArrayList;
import static org.junit.Assert.assertTrue;


>>>>>>> dev_branch
/**
 * Test AccountServiceImpl
 *
 * @author KSC
<<<<<<< HEAD
 */
=======
 *
 */

>>>>>>> dev_branch
public class AccountServiceImplTest {

    private AccountServiceImpl serviceImpl;

    @Mocked
    private AccountMapper accountMapper;

    @Before
    public void setup() {
        serviceImpl = new AccountServiceImpl();
        Deencapsulation.setField(serviceImpl, "accountMapper", accountMapper);
    }

<<<<<<< HEAD
    /**
     * Test find account by name is correct
     */
    @Test
    public void findAccountByName_correct() {
=======
    @Test
    public void findAccountByName_correct(){
>>>>>>> dev_branch
        String username = "test1";
        new NonStrictExpectations() {
            {
                Deencapsulation.invoke(accountMapper, "findAccountByName", username);
                result = new Account();
            }
        };
        Object returnObj = serviceImpl.findAccountByName(username);
<<<<<<< HEAD
        assertTrue(returnObj instanceof Account);
    }

    /**
     * add accounts is correct
     */
    @Test
    public void addAccounts_correct() {
        Account testAccount = new Account();
        testAccount.setUsername("test1");
        testAccount.setPassword("12345678");
=======

        assertTrue(returnObj instanceof Account);
    }

    @Test
    public void addAccounts_correct(){
        Account testAccount = new Account();
        testAccount.setUsername("test1");
        testAccount.setPassword("12345678");

>>>>>>> dev_branch
        new NonStrictExpectations() {
            {
                Deencapsulation.invoke(accountMapper, "addAccounts", testAccount);
            }
        };
<<<<<<< HEAD
        serviceImpl.addAccounts(testAccount);
    }

    /**
     * get all accounts is correct
     */
    @Test
    public void getAllAccounts_correct() {
=======
         serviceImpl.addAccounts(testAccount);
    }

    @Test
    public void getAllAccounts_correct(){

>>>>>>> dev_branch
        new NonStrictExpectations() {
            {
                Deencapsulation.invoke(accountMapper, "getAllAccounts");
                result = new ArrayList<Account>();
            }
        };
        Object returnObj = serviceImpl.getAllAccounts();
<<<<<<< HEAD
=======

>>>>>>> dev_branch
        assertTrue(returnObj instanceof ArrayList<?>);
    }
}
