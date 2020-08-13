/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.bootcamp.web.controller;

import com.kingland.bootcamp.domain.Account;
import com.kingland.bootcamp.service.AccountService;
<<<<<<< HEAD
import com.kingland.bootcamp.web.controller.Impl.AccountControllerImpl;
=======
import com.kingland.bootcamp.service.impl.AccountServiceImpl;
>>>>>>> dev_branch
import mockit.Deencapsulation;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import org.junit.Before;
import org.junit.Test;
import org.springframework.security.core.Authentication;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertTrue;

=======

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
>>>>>>> dev_branch
/**
 * Test AccountController
 *
 * @author KSC
 *
 */
<<<<<<< HEAD
public class AccountControllerTest {

    private AccountControllerImpl controller;
=======

public class AccountControllerTest {


    private AccountController controller;
>>>>>>> dev_branch

    @Mocked
    private  Authentication authentication;

    @Mocked
    private AccountService accountService;

    @Before
    public void setup() {
<<<<<<< HEAD
        controller = new AccountControllerImpl();
    }

    /**
     * Test index is correct
     */
    @Test
    public void index_correct(){
=======

        controller = new AccountController();
    }



    @Test
    public void index_correct(){

>>>>>>> dev_branch
        new NonStrictExpectations() {
            {
                Deencapsulation.invoke(controller, "index", authentication);
            }
        };
<<<<<<< HEAD
=======

>>>>>>> dev_branch
        Object returnObj = controller.index(authentication);
        assertTrue(returnObj instanceof Authentication);
   }

<<<<<<< HEAD
    /**
     * find account by username is correct
     */
    @Test
    public void findAccountByName_correct(){
        String username = "test4";
=======
    @Test
    public void findAccountByName_correct(){
        String username = "test4";
        Account account = new Account();
>>>>>>> dev_branch
        new NonStrictExpectations() {
            {
                Deencapsulation.invoke(controller, "findAccountByName", accountService);
                result = accountService.findAccountByName(username);
<<<<<<< HEAD
            }
        };
=======

            }
        };

>>>>>>> dev_branch
        Object returnObj = controller.findAccountByName(username);
        assertTrue(returnObj instanceof Account);
    }

<<<<<<< HEAD
    /**
     * get all accounts correct
     */
=======
>>>>>>> dev_branch
    @Test
    public void getALLAccounts_correct(){
        List<Account> accountList = new ArrayList<>();
        new NonStrictExpectations() {
            {
               Deencapsulation.invoke(controller, "getALLAccounts", accountService);
              result = accountList;
<<<<<<< HEAD
            }
        };
        List<Account> returnObj = controller.getALLAccounts();
        assertTrue(returnObj instanceof ArrayList);
    }
=======

            }
        };

        List<Account> returnObj = controller.getALLAccounts();
        assertTrue(returnObj instanceof ArrayList);
    }

>>>>>>> dev_branch
}
