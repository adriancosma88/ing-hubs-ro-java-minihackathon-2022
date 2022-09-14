package com.coding.problem9;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstUniqueNumberTest {

    FirstUniqueNumber firstUniqueNumber = new FirstUniqueNumber();

    @Test
    public void problem9_test1() {
        int[] A = new int[]{2,2,2};
        assertEquals(-1,firstUniqueNumber.solution(A));
    }


    @Test
    public void problem9_test2() {
        int[] A = new int[]{2,3,4};
        assertEquals(2,firstUniqueNumber.solution(A));
    }

    @Test
    public void problem9_test3() {
        int[] A = new int[]{2,3,2,4,4,5,4};
        assertEquals(3,firstUniqueNumber.solution(A));
    }
    @Test
    public void problem9_test4() {
        int[] A = new int[]{4,5,100000,3,2,4,4,5,4};
        assertEquals(100000,firstUniqueNumber.solution(A));
    }

    @Test
    public void problem9_test5() {
        int[] A = new int[]{4,5,100000,3,2,4,4,5,4,100000,3,2};
        assertEquals(-1,firstUniqueNumber.solution(A));
    }

    @Test
    public void problem9_test6() {
        int[] A = new int[]{3,3,4,5};
        assertEquals(4,firstUniqueNumber.solution(A));
    }

    @Test
    public void problem9_test7() {
        int[] A = new int[]{4, 10, 5, 4, 2, 10};
        assertEquals(5,firstUniqueNumber.solution(A));
    }

    @Test
    public void problem9_test8() {
        int[] A = new int[]{1, 4, 3, 3, 1, 2};
        assertEquals(4,firstUniqueNumber.solution(A));
    }
}