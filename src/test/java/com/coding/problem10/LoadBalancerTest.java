package com.coding.problem10;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.AnyOf.anyOf;
import static org.junit.jupiter.api.Assertions.*;

class LoadBalancerTest {

   LoadBalancer loadBalancer = new LoadBalancer();
    @Test
    void problem10_test1() {
        BackendInstance backendInstanceOne = new BackendInstance("One");
        loadBalancer.register(backendInstanceOne);
        assertThrows(SameInstanceException.class, ()->loadBalancer.register(backendInstanceOne));
    }

    @Test
    void problem10_test2() {
        BackendInstance backendInstanceOne = new BackendInstance("One");
        BackendInstance backendInstanceTwo = new BackendInstance("Two");
        BackendInstance backendInstanceThree = new BackendInstance("Three");
        BackendInstance backendInstanceFour = new BackendInstance("Four");
        BackendInstance backendInstanceFive = new BackendInstance("Five");
        BackendInstance backendInstanceSix = new BackendInstance("Six");

        loadBalancer.register(backendInstanceOne);
        loadBalancer.register(backendInstanceTwo);
        loadBalancer.register(backendInstanceThree);
        loadBalancer.register(backendInstanceFour);
        loadBalancer.register(backendInstanceFive);

        assertThrows(MaximumInstancesException.class, ()->loadBalancer.register(backendInstanceSix));
    }

    @Test
    void problem10_test3() {
        BackendInstance backendInstanceOne = new BackendInstance("One");
        loadBalancer.register(backendInstanceOne);
        assertEquals(backendInstanceOne, loadBalancer.get());
    }

    @Test
    void problem10_test4() {
        BackendInstance backendInstanceOne = new BackendInstance("One");
        loadBalancer.register(backendInstanceOne);
        BackendInstance backendInstanceTwo = new BackendInstance("Two");
        loadBalancer.register(backendInstanceTwo);

        assertThat(loadBalancer.get(), anyOf(is(backendInstanceOne), is(backendInstanceTwo)));
    }
}