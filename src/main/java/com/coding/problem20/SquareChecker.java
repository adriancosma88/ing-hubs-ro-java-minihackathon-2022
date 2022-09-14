package com.coding.problem20;

/**
 * You have four points defined in 2D space p1, p2, p3 and p4.
 * Return true if the four points construct a square.
 * <p>
 * The provided class Point contains the coordinates x and y.
 * <p>
 * A valid square has four equal sides with positive length
 * and four equal angles (90-degree angles).
 * <p>
 * Example 1:
 * Input: p1 = (0,0), p2 = (1,1), p3 = (1,0), p4 = (0,1)
 * Output: true
 * <p>
 * Example 2:
 * Input: p1 = (0,0), p2 = (1,1), p3 = (1,0), p4 = (0,12)
 * Output: false
 * <p>
 * Example 3:
 * Input: p1 = (1,0), p2 = (-1,0), p3 = (0,1), p4 = (0,-1)
 * Output: true
 * <p>
 * Constraints:
 * -10000 <= xi, yi <= 10000
 */
public class SquareChecker {

    public boolean isValidSquare(Point p1, Point p2, Point p3, Point p4) {
        return false;
    }

}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        if (-10000 > x || -10000 > y || 10000 < x || 10000 < y)
            throw new IllegalArgumentException("Invalid point coordinates.");

        this.x = x;
        this.y = y;
    }
}
