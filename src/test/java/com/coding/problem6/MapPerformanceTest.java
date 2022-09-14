package com.coding.problem6;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static org.junit.jupiter.api.Assertions.*;

class MapPerformanceTest {

    @Test
    void problem6_timeElapseForGetPut1() throws InterruptedException {

        MapPerformance mapPerformance = new MapPerformance();
        Map<String, Object> hashtable = new Hashtable<>();
        long hashtableAvgRuntime = mapPerformance.timeElapseForMaps(hashtable);
        assertTrue(hashtableAvgRuntime >  100);
    }

    @Test
    void problem6_timeElapseForGetPut2() throws InterruptedException {

        MapPerformance mapPerformance = new MapPerformance();
        Map<String, Object> synchronizedHashMap = Collections.synchronizedMap(new HashMap<>());
        long syncHashMapAvgRuntime = mapPerformance.timeElapseForMaps(synchronizedHashMap);
        assertTrue(syncHashMapAvgRuntime >  100);
    }


    @Test
    void problem6_timeElapseForGetPut3() throws InterruptedException {

        MapPerformance mapPerformance = new MapPerformance();
        Map<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
        long concurrentHashMapAvgRuntime = mapPerformance.timeElapseForMaps(concurrentHashMap);
        assertTrue(  concurrentHashMapAvgRuntime > 10);
    }

}