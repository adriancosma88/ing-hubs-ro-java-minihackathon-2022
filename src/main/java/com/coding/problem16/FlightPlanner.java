package com.coding.problem16;

/**
 * Your BlueAir future flight was just cancelled. You need to quickly find an alternative.
 * <p><p>
 * You are given a matrix of available flights and their prices. <p>
 * <code>flightPrices[i][j] = cost</code> means that the price of travelling
 * from city <code>i</code> to city <code>j</code> is <code>cost</code>. <p>
 * The total number of cities is given as input: <code>numberOfCities</code>
 * <p><p>
 * You are planning to still make the trip, but you are low on money. Find a way to pay less for
 * your journey.
 * <p>
 * You also get three integers <code>src, dst</code> and <code>k</code>.
 * <p>
 * Return the cheapest price from <code>src</code> to <code>dst</code>
 * with at most <code>k</code> stops. If there is no such route, return -1. *
 * <p>
 * <br/>
 * Example 1: Input: numberOfCities = 4, flightPrices = [[0,1,100],[1,2,100],[2,0,100],[1,3,600],[2,3,200]], src = 0,
 * dst = 3, maxStops = 1 Output: 700 Explanation: The optimal path with at most 1 stop from city 0 to 3
 * has cost 100 + 600 = 700. Note that the path through cities [0,1,2,3] is
 * cheaper but is invalid because it uses 2 stops.
 * <p>
 * Example 2: Input: numberOfCities = 3, flightPrices = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, maxStops = 1
 * Output: 200 Explanation: The optimal path with at most 1 stop from city
 * 0 to 2 has cost 100 + 100 = 200.
 */
public class FlightPlanner {

    public int findCheapestPrice(int numberOfCities, int[][] flightPrices, int src, int dst, int maxStops) {
        return -1;
    }
}

class Pair {
    int v;
    int wt;
    int dist;

    Pair(int v, int wt, int dist) {
        this.v = v;
        this.wt = wt;
        this.dist = dist;
    }
}
