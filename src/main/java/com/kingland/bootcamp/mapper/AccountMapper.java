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
 *
 */
@Component
public interface AccountMapper {

    Account findAccountByName(@Param("username") String username);

    void addAccounts(Account account);

    List<Account> getAllAccounts();

}
