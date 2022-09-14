package com.coding.problem18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindNumberTest {
    FindNumber findNumber = new FindNumber();

    @Test
    public void problem18_test1() {
        Assertions.assertEquals(1, findNumber.findSpecialNumber(new int[] {1, 1}));
    }

    @Test
    public void problem18_test2() {
        Assertions.assertEquals(1, findNumber.findSpecialNumber(new int[] {1}));
    }

    @Test
    public void problem18_test3() {
        Assertions.assertEquals(2, findNumber.findSpecialNumber(new int[] {1, 2, 2, 2, 2}));
    }

    @Test
    public void problem18_test4() {
        Assertions.assertEquals(6, findNumber.findSpecialNumber(
            new int[] {1, 2, 2, 6, 6, 6, 6 , 7, 10}));
    }

    @Test
    public void problem18_test5() {
        Assertions.assertEquals(3, findNumber.findSpecialNumber(
            new int[] {-10, 2, 3, 3, 3, 3, 3 , 8, 19, 10200, 11111, 12233}));
    }

    @Test
    public void problem18_test6() {
        Assertions.assertEquals(11, findNumber.findSpecialNumber(
            new int[] {1, 2, 3, 4, 5, 6, 7 , 11, 11, 11, 11, 12}));
    }

    @Test
    public void problem18_test7() {
        Assertions.assertEquals(1, findNumber.findSpecialNumber(
            new int[] {1, 1, 1, 1, 1, 1, 1 , 1, 1, 1, 1, 12}));
    }

    @Test
    public void problem18_test8() {
        Assertions.assertEquals(3, findNumber.findSpecialNumber(
            new int[] {1, 2, 3, 3, 3, 3, 7 , 7, 11, 11, 12, 12}));
    }
}
