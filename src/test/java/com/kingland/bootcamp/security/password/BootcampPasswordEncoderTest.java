/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.bootcamp.security.password;

import com.kingland.bootcamp.SecurityApplication;
import com.kingland.bootcamp.mapper.AccountMapper;
import com.kingland.bootcamp.domain.Account;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
<<<<<<< HEAD

import java.security.NoSuchAlgorithmException;

import static org.junit.Assert.assertTrue;

/**
 * Test the BootcampPasswordEncoder two methods
 *
 * @author KSC
=======
import java.security.NoSuchAlgorithmException;
import static org.junit.Assert.assertTrue;

/**
 * @author KSC
 *
>>>>>>> dev_branch
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SecurityApplication.class)
public class BootcampPasswordEncoderTest {

    @Autowired
    private BootcampPasswordEncoder bootcampPasswordEncoder;

    @Autowired
    private AccountMapper accountMapper;

    /**
     * test the password is encrypt in SHA-256 or not
<<<<<<< HEAD
     *
=======
>>>>>>> dev_branch
     * @throws NoSuchAlgorithmException
     */
    @Test
    public void testEncrypt() throws NoSuchAlgorithmException {
        Account testAccount = accountMapper.findAccountByName("test1");
        String encodePassword = bootcampPasswordEncoder.encode(testAccount.getPassword());
        Assert.assertEquals(encodePassword, "141def44fa4b0d0f2aab58509eee8ffc3e41b11d51b57764adb71e45f9920f59");
    }

    /**
<<<<<<< HEAD
     * test the matches method work
     *
=======
     * test the password is encrypt in SHA-256 or not
>>>>>>> dev_branch
     * @throws NoSuchAlgorithmException
     */
    @Test
    public void testBCPasswordEncoderMatches() throws NoSuchAlgorithmException {
        Account testAccount = accountMapper.findAccountByName("test1");
        String encodePassword = bootcampPasswordEncoder.encode(testAccount.getPassword());
<<<<<<< HEAD
        assertTrue(bootcampPasswordEncoder.matches(testAccount.getPassword(), encodePassword));
=======
        assertTrue(bootcampPasswordEncoder.matches(testAccount.getPassword(),encodePassword));
>>>>>>> dev_branch
    }
}
