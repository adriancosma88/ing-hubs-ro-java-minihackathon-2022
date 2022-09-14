package com.coding.problem6;

import java.util.Map;

/**
 * Implement method timeElapseForMaps which could receive like param :
 * - Hashtable
 * - Collections.synchronizedMap
 * - ConcurrentHashMap
 * <p>
 * for running a micro-benchmark for get and put performance and compare that to Hashtable, Collections.synchronizedMap, ConcurrentHashMap
 * 500,000 times in 10 threads.
 * <p>
 * The return will be a long in nanoseconds, and it will be a difference from startTime and actual System time when all the executions of the threads
 * are finished.
 */
public class MapPerformance {

    long timeElapseForMaps(Map<String, Object> mapInput) throws InterruptedException {
        long timeElapse = 0;

        return timeElapse;
    }
}

