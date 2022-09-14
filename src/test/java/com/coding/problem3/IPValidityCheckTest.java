package com.coding.problem3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class IPValidityCheckTest {

    @ParameterizedTest(name = "#{index} - Run test with IPv4 = {0}")
    @MethodSource("validIPv4")
    void problem3_test1(String ipv4) {
        assertTrue(IPValidityCheck.isValid(ipv4));
    }

    @ParameterizedTest(name = "#{index} - Run test with IPv4 = {0}")
    @MethodSource("invalidIPv4")
    void problem3_test2(String ipv4) {
        assertFalse(IPValidityCheck.isValid(ipv4));
    }

    static Stream<String> validIPv4() {
        return Stream.of(
                "0.0.0.0",
                "0.0.0.1",
                "127.0.0.1",
                "1.2.3.4",              // 0-9
                "11.1.1.0",             // 10-99
                "101.1.1.0",            // 100-199
                "201.1.1.0",            // 200-249
                "255.255.255.255",      // 250-255
                "192.168.1.1",
                "192.168.1.255",
                "100.100.100.100");
    }

    static Stream<String> invalidIPv4() {
        return Stream.of(
                "000.000.000.000",          // leading 0
                "00.00.00.00",              // leading 0
                "1.2.3.04",                 // leading 0
                "1.02.03.4",                // leading 0
                "003.123.045.3",            // leading 0
                "1.2",                      // 1 dot
                "1.2.3",                    // 2 dots
                "1.2.3.4.5",                // 4 dots
                "192.168.1.1.1",            // 4 dots
                "256.1.1.1",                // 256
                "1.256.1.1",                // 256
                "1.1.256.1",                // 256
                "1.1.1.256",                // 256
                "-100.1.1.1",               // -100
                "1.-100.1.1",               // -100
                "1.1.-100.1",               // -100
                "1.1.1.-100",               // -100
                "1...1",                    // empty between .
                "1..1",                     // empty between .
                "1.1.1.1.",                 // last .
                "");                        // empty
    }


}