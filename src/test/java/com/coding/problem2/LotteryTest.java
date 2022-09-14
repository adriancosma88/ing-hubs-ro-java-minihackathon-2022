package com.coding.problem2;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LotteryTest {

    private final Lottery lottery = new Lottery();

    @Test
    void problem2_test3() {
        assertEquals(6, lottery.feelingLucky().count());
    }

    @Test
    void problem2_test4() {
        IntStream results = lottery.feelingLucky();
        assertTrue(results.allMatch(number -> number >= 1 && number <= 49));
    }

}
