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
 * @author KSC
 *
 */

@RestController
public class AccountControllerImpl implements AccountController {

    @Autowired
    private AccountService accountService;

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
