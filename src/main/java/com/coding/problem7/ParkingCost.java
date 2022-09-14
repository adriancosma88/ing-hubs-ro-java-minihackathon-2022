package com.coding.problem7;

/**
 * You parked your car in a parking lot and want to compute the total cost of the ticket. The billing rules are as follows:
 * <p>
 * The entrance fee of the car parking lot is 20;
 * The first full or partial hour costs 30;
 * Each successive full or partial hour (after the first) costs 40.
 * You entered the car parking lot at time E and left at time L. In this task, times are represented as strings
 * in the format "HH:MM" (where "HH" is a two-digit number between 0 and 23, which stands for hours, and "MM" is a two-digit number between 0 and 59,
 * which stands for minutes).
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(String E, String L); }
 * <p>
 * that, given strings E and L specifying points in time in the format "HH:MM", returns the total cost of the parking bill
 * from your entry at time E to your exit at time L. You can assume that E describes a time before L on the same day.
 * <p>
 * For example, given "10:00" and "13:21" your function should return 170, because the entrance fee equals 20, the first hour
 * costs 30 and there are two more full hours and part of a further hour, so the total cost is 20 + 30 + (3 * 40) = 170.
 * Given "09:42" and "11:42" your function should return 90, because the entrance fee equals 20, the first hour costs 30
 * and the second hour costs 40, so the total cost is 20 + 30 + 40 = 90.
 * <p>
 * Assume that:
 * <p>
 * strings E and L follow the format "HH:MM" strictly;
 * string E describes a time before L on the same day.
 */
public class ParkingCost {

    public int solution(String e, String l) {
        return -1;
    }

}
