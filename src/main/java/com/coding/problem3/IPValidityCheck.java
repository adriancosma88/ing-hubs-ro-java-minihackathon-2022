package com.coding.problem3;

/**
 * Write a class called MyRegex which will contain a string pattern. You need to write a regular expression and assign
 * it to the pattern such that it can be used to validate an IPv4 address.
 * Pay attention IPs with leading 0 are invalid in this exercise. See examples below.
 * <p>
 * Some valid IP address:
 * "0.0.0.0",
 * "0.0.0.1",
 * "127.0.0.1",
 * "1.2.3.4",              // 0-9
 * "11.1.1.0",             // 10-99
 * "101.1.1.0",            // 100-199
 * "201.1.1.0",            // 200-249
 * "255.255.255.255",      // 250-255
 * "192.168.1.1",
 * "192.168.1.255",
 * "100.100.100.100"
 * <p>
 * Some invalid IP address:
 * "1.02.03.4",                // leading 0
 * "003.123.045.3",
 * "1.2",                      // 1 dot
 */
public class IPValidityCheck {

    public static boolean isValid(final String email) {
        return false;
    }

}
