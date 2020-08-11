/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.bootcamp.security.password;

import com.kingland.bootcamp.common.Common;
import org.springframework.security.crypto.password.PasswordEncoder;
import java.security.NoSuchAlgorithmException;

/**
 * @author KSC
 *
 */
public class BootcampPasswordEncoder implements PasswordEncoder {

    private static BootcampDigestAlgorithm bootcampDigestAlgorithm;

    @Override
    public String encode(CharSequence rawPassword) {

        String encodedPassword = "";
//        String salt =  BootcampDigestAlgorithm.getSalt();
//        String saltedPassword = Common.PREFIX + salt + rawPassword.toString() + Common.SUFFIX;
        String saltedPassword = Common.PREFIX + Common.SALT + rawPassword.toString() + Common.SUFFIX;
        try {
            encodedPassword = bootcampDigestAlgorithm.toHexString(bootcampDigestAlgorithm.getSHA(saltedPassword));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return encodedPassword;
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {

        String encodePassword = "";

        if( !(String.valueOf(rawPassword).isEmpty()) ) {
            //create password encoder
            encodePassword = encode(String.valueOf(rawPassword));
        }

        return BootcampPasswordEncoderUtils.equals(encodedPassword, encodePassword);
    }
}
