/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.bootcamp.service;

import com.kingland.bootcamp.domain.Account;

import java.util.List;

/**
 * @author KSC
 */
public interface AccountService {
    /**
     * find account by username
     * @param username
     * @return
     */
    Account findAccountByName(String username);

    /**
     * add accounts
     * @param account
     */
    void addAccounts(Account account);

    /**
     * get all accounts
     * @return
     */
    List<Account> getAllAccounts();
}
