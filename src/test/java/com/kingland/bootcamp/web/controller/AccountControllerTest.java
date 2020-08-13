/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.bootcamp.web.controller;

import com.kingland.bootcamp.domain.Account;
import com.kingland.bootcamp.service.AccountService;
import com.kingland.bootcamp.web.controller.Impl.AccountControllerImpl;
import mockit.Deencapsulation;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import org.junit.Before;
import org.junit.Test;
import org.springframework.security.core.Authentication;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertTrue;

/**
 * Test AccountController
 *
 * @author KSC
 *
 */
public class AccountControllerTest {

    private AccountControllerImpl controller;

    @Mocked
    private  Authentication authentication;

    @Mocked
    private AccountService accountService;

    @Before
    public void setup() {
        controller = new AccountControllerImpl();
    }

    /**
     * Test index is correct
     */
    @Test
    public void index_correct(){
        new NonStrictExpectations() {
            {
                Deencapsulation.invoke(controller, "index", authentication);
            }
        };
        Object returnObj = controller.index(authentication);
        assertTrue(returnObj instanceof Authentication);
   }

    /**
     * find account by username is correct
     */
    @Test
    public void findAccountByName_correct(){
        String username = "test4";
        new NonStrictExpectations() {
            {
                Deencapsulation.invoke(controller, "findAccountByName", accountService);
                result = accountService.findAccountByName(username);
            }
        };
        Object returnObj = controller.findAccountByName(username);
        assertTrue(returnObj instanceof Account);
    }

    /**
     * get all accounts correct
     */
    @Test
    public void getALLAccounts_correct(){
        List<Account> accountList = new ArrayList<>();
        new NonStrictExpectations() {
            {
               Deencapsulation.invoke(controller, "getALLAccounts", accountService);
              result = accountList;
            }
        };
        List<Account> returnObj = controller.getALLAccounts();
        assertTrue(returnObj instanceof ArrayList);
    }
}
