package com.coding.problem7;

import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingCostTest {

   ParkingCost parkingFee = new ParkingCost();

    @Test
    public void problem7_test1() {
        assertEquals(50,parkingFee.solution("10:31", "11:31"));
    }

    @Test
    public void problem7_test2() throws ParseException {
        assertEquals(90,parkingFee.solution("10:31", "11:32"));
    }

    @Test
    public void problem7_test3() throws ParseException {
        assertEquals(130,parkingFee.solution("10:31", "12:52"));
    }

    @Test
    public void problem7_test4() throws ParseException {
        assertEquals(50,parkingFee.solution("10:31", "10:52"));
    }

    @Test
    public void problem7_test5() throws ParseException {
        assertEquals(930,parkingFee.solution("00:31", "22:52"));
    }
}