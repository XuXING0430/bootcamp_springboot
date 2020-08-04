/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.bootcamp.dao;

import com.kingland.bootcamp.domian.Account;
import org.apache.ibatis.annotations.Param;

/**
 * @author KSC
 *
 */
public interface AccountDao {
    Account findAccountByName(@Param("username") String username);

}
