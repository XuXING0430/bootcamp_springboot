/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.bootcamp.service.impl;

import com.kingland.bootcamp.dao.AccountDao;
import com.kingland.bootcamp.domian.Account;
import com.kingland.bootcamp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author KSC
 *
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public Account findAccountByName(String username) {
        return accountDao.findAccountByName(username);
    }
}
