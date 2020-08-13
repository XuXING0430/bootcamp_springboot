/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.bootcamp.web.controller;

import com.kingland.bootcamp.domain.Account;
import com.kingland.bootcamp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The interface of AccountController
 *
 * @author KSC
 */
public interface AccountController {

    /**
     * find account by name
     *
     * @param username
     * @return
     */
    Account findAccountByName(String username);

    /**
     * get all accounts
     *
     * @return
     */
    List<Account> getALLAccounts();

    /**
     * add accounts
     *
     * @param account
     */
    void addAccounts(Account account);

    /**
     * get the authentication
     *
     * @param authentication
     * @return
     */
    Authentication index(Authentication authentication);

}
