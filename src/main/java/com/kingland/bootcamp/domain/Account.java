/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.bootcamp.domain;

import com.kingland.bootcamp.common.consts.MessageConst;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author KSC
 */
public class Account implements Serializable {
    private static final long serialVersionUID = 325L;

    @NotNull
    private Long userId;

    @NotNull
    @Size(min = 4, max = 20, message = MessageConst.LENGTH_NOT_VAILD)
    @Pattern(regexp = "^[a-zA-Z0-9_]$", message = MessageConst.USERNAME_NOT_VAILD)
    private String username;

    @NotNull
    @Size(min = 8, max = 40, message = MessageConst.LENGTH_NOT_VAILD)
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$", message = MessageConst.PASSWORD_NOT_VAILD)
    private String password;

    private boolean accountNonExpired = true;

    private boolean accountNonLocked = true;

    private boolean credentialsNonExpired = true;

    private boolean enabled = true;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    public void setAccountNonExpired(boolean accountNonExpired) {

        this.accountNonExpired = accountNonExpired;
    }

    public boolean isAccountNonLocked() {

        return accountNonLocked;
    }

    public void setAccountNonLocked(boolean accountNonLocked) {

        this.accountNonLocked = accountNonLocked;
    }

    public boolean isCredentialsNonExpired() {

        return credentialsNonExpired;
    }

    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {

        this.enabled = enabled;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "Account{" +
                "userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", accountNonExpired=" + accountNonExpired +
                ", accountNonLocked=" + accountNonLocked +
                ", credentialsNonExpired=" + credentialsNonExpired +
                ", enabled=" + enabled +
                '}';
    }

}
