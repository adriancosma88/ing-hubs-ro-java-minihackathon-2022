package com.coding.problem20;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SquareCheckerTest {
    SquareChecker squareChecker = new SquareChecker();

    @Test
    public void problem20_test1() {
        assertFalse(squareChecker.isValidSquare(new Point(0, 0), new Point(0, 0), new Point(0, 0), new Point(0, 0)));
    }

    @Test
    public void problem20_test2() {
        assertFalse(squareChecker.isValidSquare(new Point(0, 0), new Point(1, 1), new Point(1, 1), new Point(0, 1)));
    }

    @Test
    public void problem20_test3() {
        assertTrue(squareChecker.isValidSquare(new Point(0, 0), new Point(1, 1), new Point(1, 0), new Point(0, 1)));
    }

    @Test
    public void problem20_test4() {
        assertFalse(squareChecker.isValidSquare(new Point(0, 0), new Point(1, 1), new Point(1, 0), new Point(0, 12)));
    }

    @Test
    public void problem20_test5() {
        assertTrue(squareChecker.isValidSquare(new Point(1, 0), new Point(-1, 0), new Point(0, 1), new Point(0, -1)));
    }

    @Test
    public void problem20_test6() {
        assertTrue(squareChecker.isValidSquare(new Point(9999, 0), new Point(-9999, 0), new Point(0, 9999), new Point(0, -9999)));
    }

    @Test
    public void problem20_test7() {
        assertFalse(squareChecker.isValidSquare(new Point(1, 2), new Point(1, 1), new Point(-2, -2), new Point(2, -1)));
    }

    @Test
    public void problem20_test8() {
        assertFalse(squareChecker.isValidSquare(new Point(1, 2), new Point(1, 1), new Point(-2, -2), new Point(2, 1)));
    }

    @Test
    public void problem20_test9() {
        assertTrue(squareChecker.isValidSquare(new Point(4, 5), new Point(12, 5), new Point(12, -3), new Point(4, -3)));
    }

    @Test
    public void problem20_test10() {
        assertFalse(squareChecker.isValidSquare(new Point(0, 0), new Point(3, 4), new Point(8, 4), new Point(5, 0)));
    }

    @Test
    public void problem20_test11() {
        assertFalse(squareChecker.isValidSquare(new Point(0, 0), new Point(0, 2), new Point(3, 2), new Point(3, 0)));
    }

    @Test
    public void problem20_test12() {
        assertTrue(squareChecker.isValidSquare(new Point(0, 0), new Point(2, 1), new Point(3, -1), new Point(1, -2)));
    }
}
