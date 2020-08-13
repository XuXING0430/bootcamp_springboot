/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.bootcamp.service.impl;

import com.kingland.bootcamp.mapper.AccountMapper;
import com.kingland.bootcamp.domain.Account;
import com.kingland.bootcamp.security.password.BootcampPasswordEncoder;
import com.kingland.bootcamp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
<<<<<<< HEAD
 * Implements AccountService
 *
 * @author KSC
=======
 * @author KSC
 *
>>>>>>> dev_branch
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private BootcampPasswordEncoder bootcampPasswordEncoder;

    @Override
    public Account findAccountByName(String username) {
<<<<<<< HEAD
=======

>>>>>>> dev_branch
        return accountMapper.findAccountByName(username);
    }

    /**
     * encrypt password before insert it in database
<<<<<<< HEAD
     *
=======
>>>>>>> dev_branch
     * @return
     */
    @Override
    public void addAccounts(Account account) {
<<<<<<< HEAD
=======

>>>>>>> dev_branch
        account.setPassword(bootcampPasswordEncoder.encode(account.getPassword()));
        accountMapper.addAccounts(account);
    }

<<<<<<< HEAD
    /**
     * get all accounts
     * @return
     */
    @Override
    public List<Account> getAllAccounts() {
=======
    @Override
    public List<Account> getAllAccounts() {

>>>>>>> dev_branch
        return accountMapper.getAllAccounts();
    }
}
