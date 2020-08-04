/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.bootcamp.controller;

import com.kingland.bootcamp.domian.Account;
import com.kingland.bootcamp.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author KSC
 *
 * Simple Controller
 */
@RestController
public class AccountRestController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/test/account",method = RequestMethod.GET)
    public Account findAccount(@RequestParam(value = "username",required = true) String username){
        return accountService.findAccountByName(username);
    }
}
