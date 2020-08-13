/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.bootcamp.service;

import com.kingland.bootcamp.domain.Account;

import java.util.List;

/**
 * @author KSC
<<<<<<< HEAD
=======
 *
>>>>>>> dev_branch
 */
public interface AccountService {

    Account findAccountByName(String username);

    void addAccounts(Account account);

    List<Account> getAllAccounts();
}
