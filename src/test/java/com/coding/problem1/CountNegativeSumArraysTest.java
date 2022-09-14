package com.coding.problem1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountNegativeSumArraysTest
{

    CountNegativeSumArrays negativeSubArray = new CountNegativeSumArrays();

    @Test
    public void problem1_test1() {
        int[] array = new int[]{1, -2, 4, -5, 1};
        assertEquals(9, negativeSubArray.solution(array));

    }

    @Test
    public void problem1_test3() {
        int[] array = new int[]{-2};
        assertEquals(1, negativeSubArray.solution(array));

    }
    @Test
    public void problem1_test4() {
        int[] array = new int[]{1,4,5,6,7,7,7,7,7,7};
        assertEquals(0, negativeSubArray.solution(array));

    }

    @Test
    public void problem1_test5() {
        int[] array = new int[]{1,-9};
        assertEquals(2, negativeSubArray.solution(array));

    }
}