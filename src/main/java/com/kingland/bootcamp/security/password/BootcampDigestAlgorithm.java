/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.bootcamp.security.password;

<<<<<<< HEAD
=======
import com.kingland.bootcamp.common.Common;

>>>>>>> dev_branch
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
<<<<<<< HEAD
=======
import java.security.SecureRandom;
>>>>>>> dev_branch

/**
 * Digest Algorithm : use SHA-256 algorithm
 *
 * @author KSC
<<<<<<< HEAD
=======
 *
>>>>>>> dev_branch
 */
public class BootcampDigestAlgorithm {

    public static byte[] getSHA(String input) throws NoSuchAlgorithmException {
        // Static getInstance method is called with hashing SHA
        MessageDigest md = MessageDigest.getInstance("SHA-256");
<<<<<<< HEAD
=======

>>>>>>> dev_branch
        return md.digest(input.getBytes(StandardCharsets.UTF_8));
    }

    public static String toHexString(byte[] hash) {
        // Convert byte array into signum representation
        BigInteger number = new BigInteger(1, hash);
<<<<<<< HEAD
        // Convert message digest into hex value
        StringBuilder hexString = new StringBuilder(number.toString(16));
=======

        // Convert message digest into hex value
        StringBuilder hexString = new StringBuilder(number.toString(16));

>>>>>>> dev_branch
        // Pad with leading zeros
        while (hexString.length() < 32) {
            hexString.insert(0, '0');
        }
<<<<<<< HEAD
        return hexString.toString();
    }
=======

        return hexString.toString();
    }


>>>>>>> dev_branch
}
