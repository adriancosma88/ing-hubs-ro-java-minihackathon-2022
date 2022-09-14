package com.coding.problem15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FairytaleWeddingTest {
    FairytaleWedding wedding = new FairytaleWedding();
    @Test
    public void problem15_test1() {
        assertEquals(1, wedding.alpacasNecessary(new int[]{1}, 3));
    }

    @Test
    public void problem15_test2() {
        assertEquals(1, wedding.alpacasNecessary(new int[]{1, 2}, 3));
    }

    @Test
    public void problem15_test3() {
      assertEquals(2, wedding.alpacasNecessary(new int[]{1, 2, 3}, 3));
    }

    @Test
    public void problem15_test4() {
      assertEquals(3, wedding.alpacasNecessary(new int[]{3, 2, 2, 1}, 3));
    }

    @Test
    public void problem15_test5() {
      assertEquals(4, wedding.alpacasNecessary(new int[]{3, 5, 3, 4}, 5));
    }

    @Test
    public void problem15_test6() {
      assertEquals(12, wedding.alpacasNecessary(
          new int[]{3, 5, 3, 4, 6, 6, 1, 2, 5, 5, 7, 6, 7, 3, 3, 2, 7, 8, 8, 10, 1, 5, 7}, 11));
    }

    @Test
    public void problem15_test7() {
        assertEquals(12, wedding.alpacasNecessary(
            new int[]{3, 5, 3, 4, 6, 6, 1, 2, 5, 5, 7, 6, 7, 3, 3, 2, 7, 8, 8, 10, 1, 5, 7}, 11));
    }

    @Test
    public void problem15_test8() {
        assertEquals(12, wedding.alpacasNecessary(
            new int[]{3, 5, 3, 4, 6, 6, 1, 2, 5, 5, 7, 6, 7, 3, 3, 2, 7, 8, 8, 10, 1, 5, 7}, 11));
    }

    @Test
    public void problem15_test9() {
        assertEquals(12, wedding.alpacasNecessary(
            new int[]{3, 2, 3, 4, 6, 3, 1, 2, 5, 5, 7, 6, 7, 3, 3, 2, 7, 8, 8, 2, 1, 5, 7}, 9));
    }

    @Test
    public void problem15_test10() {
        assertEquals(16, wedding.alpacasNecessary(
            new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 1));
    }

    @Test
    public void problem15_test11() {
        assertEquals(8, wedding.alpacasNecessary(
            new int[]{1, 1, 50, 1, 100, 1, 52, 1, 1, 57, 1, 1, 25, 1, 42, 1}, 101));
    }

}
