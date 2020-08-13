/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.bootcamp.security.browser;

import com.kingland.bootcamp.mapper.AccountMapper;
import com.kingland.bootcamp.domain.Account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
/**
 * Return the account information
 *
 * @author KSC
 */
=======

/**
 *  Return the account information
 *
 * @author KSC
 */

>>>>>>> dev_branch
@Configuration
@Service
public class AccountDetailService implements UserDetailsService {

    @Autowired
    private AccountMapper accountMapper;

<<<<<<< HEAD
    /**
     * load the user by username
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
=======
>>>>>>> dev_branch
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Account testUser = accountMapper.findAccountByName(username);
<<<<<<< HEAD
        if (testUser == null) {
=======
        if (testUser == null){
>>>>>>> dev_branch
            throw new UsernameNotFoundException("Could not find user");
        }

        return new User(username, testUser.getPassword(), testUser.isEnabled(),
                testUser.isAccountNonExpired(), testUser.isCredentialsNonExpired(),
                testUser.isAccountNonLocked(), AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
