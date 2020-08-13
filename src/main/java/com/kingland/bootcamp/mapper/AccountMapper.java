/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.bootcamp.mapper;

import com.kingland.bootcamp.domain.Account;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author KSC
 */
@Component
public interface AccountMapper {
    /**
     * find account by username
     *
     * @param username
     * @return
     */
    Account findAccountByName(@Param("username") String username);

    /**
     * add accounts
     *
     * @param account
     */
    void addAccounts(Account account);

    /**
     * get all the accounts
     *
     * @return
     */
    List<Account> getAllAccounts();

}
