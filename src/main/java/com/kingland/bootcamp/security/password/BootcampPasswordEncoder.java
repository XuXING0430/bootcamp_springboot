/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.bootcamp.security.password;

import com.kingland.bootcamp.common.Common;
import org.springframework.security.crypto.password.PasswordEncoder;
<<<<<<< HEAD

=======
>>>>>>> dev_branch
import java.security.NoSuchAlgorithmException;

/**
 * @author KSC
<<<<<<< HEAD
=======
 *
>>>>>>> dev_branch
 */
public class BootcampPasswordEncoder implements PasswordEncoder {

    private static BootcampDigestAlgorithm bootcampDigestAlgorithm;

<<<<<<< HEAD
    /**
     * encode the rawPassword
     *
     * @param rawPassword
     * @return
     */
    @Override
    public String encode(CharSequence rawPassword) {
        String encodedPassword = "";
=======
    @Override
    public String encode(CharSequence rawPassword) {

        String encodedPassword = "";
//        String salt =  BootcampDigestAlgorithm.getSalt();
//        String saltedPassword = Common.PREFIX + salt + rawPassword.toString() + Common.SUFFIX;
>>>>>>> dev_branch
        String saltedPassword = Common.PREFIX + Common.SALT + rawPassword.toString() + Common.SUFFIX;
        try {
            encodedPassword = bootcampDigestAlgorithm.toHexString(bootcampDigestAlgorithm.getSHA(saltedPassword));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
<<<<<<< HEAD
        return encodedPassword;
    }

    /**
     * matches the rawPassword and encodedPassword
     * @param rawPassword
     * @param encodedPassword
     * @return
     */
    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        String encodePassword = "";
        if (!(String.valueOf(rawPassword).isEmpty())) {
            encodePassword = encode(String.valueOf(rawPassword));
        }
=======

        return encodedPassword;
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {

        String encodePassword = "";

        if( !(String.valueOf(rawPassword).isEmpty()) ) {
            //create password encoder
            encodePassword = encode(String.valueOf(rawPassword));
        }

>>>>>>> dev_branch
        return BootcampPasswordEncoderUtils.equals(encodedPassword, encodePassword);
    }
}
