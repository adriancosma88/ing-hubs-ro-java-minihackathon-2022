package com.coding.problem16;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FlightPlannerTest {
    FlightPlanner flightPlanner = new FlightPlanner();
    @Test
    public void problem16_test1() {
        assertEquals(700, flightPlanner.findCheapestPrice(
            4, new int[][] {{0,1,100}, {1,2,100}, {2,0,100}, {1,3,600}, {2,3,200}}, 0, 3, 1));
    }

    @Test
    public void problem16_test2() {
        assertEquals(200, flightPlanner.findCheapestPrice(
            3, new int[][] {{0,1,100}, {1,2,100}, {0,2,500}}, 0, 2, 1));
    }

    @Test
    public void problem16_test3() {
        assertEquals(500, flightPlanner.findCheapestPrice(
            3, new int[][] {{0,1,100}, {1,2,100}, {0,2,500}}, 0, 2, 0));
    }

    @Test
    public void problem16_test4() {
        assertEquals(100, flightPlanner.findCheapestPrice(
            2, new int[][] {{0,1,100}}, 0, 1, 0));
    }

    @Test
    public void problem16_test5() {
        assertEquals(100, flightPlanner.findCheapestPrice(
            2, new int[][] {{0,1,100}}, 0, 1, 2));
    }

    @Test
    public void problem16_test6() {
        assertEquals(-1, flightPlanner.findCheapestPrice(
            6, new int[][] {{0,1,100}, {1,2,100}, {2,0,100}, {1,3,600}, {2,3,200}, {3,4,300}, {2,4,100}, {4,5,200}, {2,5,800}}, 0, 5, 1));
    }

    @Test
    public void problem16_test7() {
        assertEquals(500, flightPlanner.findCheapestPrice(
            6, new int[][] {{0,1,100}, {1,2,100}, {2,0,100}, {1,3,600}, {2,3,200}, {3,4,300}, {2,4,100}, {4,5,200}, {2,5,800}}, 0, 5, 3));
    }
}
