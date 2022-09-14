package com.coding.problem17;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BinarySecretsTest {

    private final BinarySecrets binarySecrets = new BinarySecrets();

    @Test
    void problem17_test1() {
        assertEquals(List.of("go straight ahead"), binarySecrets.calculateSigns(1));
    }

    @Test
    void problem17_test2() {
        assertEquals(List.of("turn left"), binarySecrets.calculateSigns(2));
    }

    @Test
    void problem17_test3() {
        assertEquals(List.of("turn right"), binarySecrets.calculateSigns(4));
    }

    @Test
    void problem17_test4() {
        assertEquals(List.of("go back"), binarySecrets.calculateSigns(8));
    }

    @Test
    void problem17_test5() {
        assertEquals(List.of("go straight ahead", "turn left"), binarySecrets.calculateSigns(3));
    }

    @Test
    void problem17_test6() {
        assertEquals(List.of("turn left", "go straight ahead"),
                binarySecrets.calculateSigns(19));
    }

    @Test
    void problem17_test7() {
        assertEquals(List.of("go back"), binarySecrets.calculateSigns(24));
    }

    @Test
    void problem17_test8() {
        assertTrue(binarySecrets.calculateSigns(16).isEmpty());
    }

    @Test
    void problem17_test9() {
        assertEquals(List.of("go straight ahead", "turn left", "turn right", "go back"),
                binarySecrets.calculateSigns(15));
    }

    @Test
    void problem17_test10() {
        assertEquals(List.of("go back",
                        "turn right",
                        "turn left",
                        "go straight ahead"),
                binarySecrets.calculateSigns(31));
    }

    @Test
    void problem17_test11() {
        assertTrue(binarySecrets.calculateSigns(0).isEmpty());
    }

    @Test
    void problem17_test12() {
        assertEquals(List.of("turn left", "go straight ahead"), binarySecrets.calculateSigns(51));
    }

    @Test
    void problem17_test13() {
        assertEquals(List.of("go straight ahead", "turn left"), binarySecrets.calculateSigns(35));
    }

    @Test
    void problem17_test14() {
        assertEquals(List.of("go straight ahead", "turn left", "turn right", "go back"),
                binarySecrets.calculateSigns(111));
    }
}
