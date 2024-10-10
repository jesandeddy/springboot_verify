package com.coder.test;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @author: chao.an
 * @since: 2024-08-06 14:02
 */
public class CoderTest {

    public static void test(String[] args) {
        String newUserCode = "CampusAppHomePopupNewUser";
        String normalUserCode = "CampusAppHomePopupNormalUser";
        String newUserCodeDigest = DigestUtils.md5Hex(newUserCode);
        String normalUserCodeDigest = DigestUtils.md5Hex(normalUserCode);
        System.out.println("newUserCodeDigest -> "+  newUserCodeDigest);
        System.out.println("normalUserCodeDigest -> " + normalUserCodeDigest);
    }
}
