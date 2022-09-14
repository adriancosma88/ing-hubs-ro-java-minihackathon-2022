package com.coding.problem9;

/**
 * a non-empty array a consisting of N integers is given. The unique number is the number that occurs exactly once in array a.
 * <p>
 * For example, the following array a:
 * <p>
 * a[0] = 4
 * a[1] = 10
 * a[2] = 5
 * a[3] = 4
 * a[4] = 2
 * a[5] = 10
 * contains two unique numbers (5 and 2).
 * <p>
 * You should find the first unique number in a. In other words, find the unique number with the lowest position in a.
 * <p>
 * For above example, 5 is in second position (because a[2] = 5) and 2 is in fourth position (because a[4] = 2). So, the first unique number is 5.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] a); }
 * <p>
 * that, given a non-empty array a of N integers, returns the first unique number in a. The function should return −1 if there are no unique numbers in a.
 * <p>
 * For example, given:
 * <p>
 * a[0] = 1
 * a[1] = 4
 * a[2] = 3
 * a[3] = 3
 * a[4] = 1
 * a[5] = 2
 * the function should return 4. There are two unique numbers (4 and 2 occur exactly once).
 * The first one is 4 in position 1 and the second one is 2 in position 5.
 * The function should return 4 because it is unique number with the lowest position.
 * <p>
 * Given array a such that:
 * <p>
 * a[0] = 6
 * a[1] = 4
 * a[2] = 4
 * a[3] = 6
 * the function should return −1. There is no unique number in a (4 and 6 occur more than once).
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [1..100,000];
 * each element of array a is an integer within the range [0..1,000,000,000].
 */
public class FirstUniqueNumber {
    public int solution(int[] a) {
        return -1;
    }
}
