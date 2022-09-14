package com.coding.problem12;

import org.junit.jupiter.api.Test;

import java.util.Base64;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class AESEncryptionTest {

    private static final String testMessage = "message";
    private static final String testSecret = "m2j0DbD4pDhHuJ/BV+Yzag==";

    private static final String iv = "51ayGT9h15JPS+4Kw91Klw==";

    @Test
    void problem12_test1() throws Exception {
        String result = AESEncryption.encrypt(testMessage, testSecret, iv);
        try {
            Base64.getDecoder().decode(result);
        } catch(IllegalArgumentException iae) {
            fail();
        }
    }

    @Test
    void problem12_test2() throws Exception {
        String result = AESEncryption.encrypt(testMessage, testSecret, iv);
        assertEquals(testMessage, AESEncryption.decrypt(result, testSecret, iv));
    }

}
