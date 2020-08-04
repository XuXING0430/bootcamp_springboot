/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.bootcamp.service;

import com.kingland.bootcamp.domian.Account;

/**
 * @author KSC
 *
 */
public interface AccountService {
    Account findAccountByName(String username);
}
