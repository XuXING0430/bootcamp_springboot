/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.bootcamp.web.controller.Impl;

import com.kingland.bootcamp.domain.Account;
import com.kingland.bootcamp.service.AccountService;
import com.kingland.bootcamp.web.controller.AccountController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
<<<<<<< HEAD
 * The account controller
 *
 * @author KSC
 */
=======
 * @author KSC
 *
 */

>>>>>>> dev_branch
@RestController
public class AccountControllerImpl implements AccountController {

    @Autowired
    private AccountService accountService;

<<<<<<< HEAD
    /**
     * Find account information by account name
     *
     * @param username
     * @return
     */
    @Override
    @RequestMapping(value = "/api/findAccountByName", method = RequestMethod.GET)
    public Account findAccountByName(@RequestParam(value = "username", required = true) String username) {
        return accountService.findAccountByName(username);
    }

    /**
     * Find all the accounts
     * @return
     */
    @Override
    @RequestMapping(value = "/api/findAllAccounts", method = RequestMethod.GET)
    public List<Account> getALLAccounts() {
        return accountService.getAllAccounts();
    }

    /**
     * Add a account with username and password
     * @param account
     */
    @Override
    @RequestMapping(value = "/api/addAccount", method = RequestMethod.GET)
    public void addAccounts(Account account) {
        accountService.addAccounts(account);
    }

    /**
     * Check the if the account is authorized
     * @param authentication
     * @return
     */
    @Override
    @GetMapping("index")
    public Authentication index(Authentication authentication) {
        return authentication;
    }
}
=======
    @RequestMapping(value = "/api/findAccountByName",method = RequestMethod.GET)
    public Account findAccountByName(@RequestParam(value = "username",required = true) String username){
        return accountService.findAccountByName(username);
    }

    @RequestMapping(value = "/api/findAllAccounts",method = RequestMethod.GET)
    public List<Account> getALLAccounts(){

        return accountService.getAllAccounts();
    }

    @RequestMapping(value = "/api/addAccount",method = RequestMethod.GET)
    public void addAccounts(Account account){

        accountService.addAccounts(account);
    }

    @GetMapping("index")
    public Object index(Authentication authentication) {

        return authentication;
    }
}
>>>>>>> dev_branch
