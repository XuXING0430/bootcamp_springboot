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
 * @author KSC
 *
 */

public interface AccountController {

    Account findAccountByName(String username);

    List<Account> getALLAccounts();

    void addAccounts(Account account);

    Object index(Authentication authentication);

}
