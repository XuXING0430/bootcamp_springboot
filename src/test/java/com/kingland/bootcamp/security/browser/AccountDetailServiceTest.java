package com.kingland.bootcamp.security.browser;

import com.kingland.bootcamp.domain.Account;
import com.kingland.bootcamp.mapper.AccountMapper;
import mockit.Deencapsulation;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import org.junit.Before;
import org.junit.Test;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import static org.junit.Assert.assertTrue;

public class AccountDetailServiceTest {
    private AccountDetailService detailService;

    @Mocked
    private AccountMapper accountMapper;

    @Mocked
    private UserDetails userDetails;

    @Before
    public void setup(){
        detailService = new AccountDetailService();
        Deencapsulation.setField(detailService,"accountMapper",accountMapper);
    }

    @Test
    public void loadUserByUsername_correct(){
        String username = "test1";
        new NonStrictExpectations() {
            {
                Deencapsulation.invoke(accountMapper, "loadUserByUsername", username);
                result = userDetails;
            }
        };
        Object returnObj = detailService.loadUserByUsername(username);

        assertTrue(returnObj instanceof User);
    }

}
