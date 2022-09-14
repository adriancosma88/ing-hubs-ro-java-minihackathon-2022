package com.coding.problem10;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 1. 	Create a LoadBalancer class that has a method to register backend instances
 * Each backend instance address should be unique, it should not be possible to register the same address two times
 * Load balancer should accept up to 5 backend instances
 * LoadBalancerCustomException to be thrown if there are more than five instances to be added
 * The code should be production ready
 * <p>
 * 2. 	Implement a get() method which should return one backend-instance choosing between the registered ones randomly.
 */
public class LoadBalancer {

    final int maxCapacity = 5;
    Map<String, BackendInstance> ipInput = new ConcurrentHashMap<>(maxCapacity);

    public void register(BackendInstance input) {
    }

    public BackendInstance get() {
        return null;
    }
}




