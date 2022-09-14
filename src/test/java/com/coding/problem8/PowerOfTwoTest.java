package com.coding.problem8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerOfTwoTest {

    PowerOfTwo powerOfTwo = new PowerOfTwo();

    @Test
    public void problem8_test1() {
        assertEquals(9,powerOfTwo.solution(1000000000));
    }

    @Test
    public void problem8_test2() {
        assertEquals(0,powerOfTwo.solution(1));
    }


    @Test
    public void problem8_test3() {
        assertEquals(29,powerOfTwo.solution(536870912));
    }

    @Test
    public void problem8_test4() {
        assertEquals(2,powerOfTwo.solution(4));
    }

    @Test
    public void problem8_test5() {
        assertEquals(3,powerOfTwo.solution(8));
    }

    @Test
    public void problem8_test6() {
        assertEquals(0,powerOfTwo.solution(9999999));
    }

    @Test
    public void problem8_test7() {
        assertEquals(1,powerOfTwo.solution(9999998));
    }
}