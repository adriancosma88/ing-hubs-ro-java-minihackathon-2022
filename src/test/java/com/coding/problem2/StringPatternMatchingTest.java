package com.coding.problem2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringPatternMatchingTest {
    StringPatternMatching problem2 = new StringPatternMatching();

    @Test
    public void problem2_test5() {
        assertEquals(1, problem2.solutionPattern("array"));
    }

    @Test
    public void problem2_test6() {
        assertEquals(0, problem2.solutionPattern(new ArrayList<>()));
    }
}