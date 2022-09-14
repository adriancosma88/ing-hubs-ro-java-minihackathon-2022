package com.coding.problem5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


class FuturesTest {

    private static final String FAILURE_MESSAGE = "This CompletableFuture has failed";

    private CompletableFuture<String> givenFuture;

    @BeforeEach
    public void setUp() {
        givenFuture = CompletableFuture
                .failedFuture(new ExecutionException(new UnexpectedException(FAILURE_MESSAGE)));
    }

    /**
     * TASK: Write a unit test that calls the givenFuture and is able to work with either a success return or
     * an exception
     * The test must assert (at least) the following:
     * - exception is of the correct type
     * - exception message is correct
     * - the success object is of the expected type
     */
    @Test
    void problem5_futureHandling1() {

    }

    /**
     * TASK: Write a unit test that calls the givenFuture and is able to work with either a success return or
     * an exception and return a result
     * The test must assert (at least) the following:
     * - exception is of the correct type
     * - exception message is correct
     * - the success object is of the expected type
     * - the returned result is as expected (you can choose the result returned by the method called on the future)
     */
    @Test
    void problem5_futureHandling2() {
        String handleOutput = "try to recover via handle()";

    }

    /**
     * TASK: Write a unit test that calls the givenFuture and is "interested" in implementing logic
     * only if the future fails
     * The test must assert (at least) the following:
     * - exception is of the correct type
     * - exception message is correct
     * - the returned result is as expected (you can choose the result returned by the method called on the future)
     */
    @Test
    void problem5_futureHandling3() {
        String exceptionallyOutput = "try to recover via exceptionally()";

    }

    static class UnexpectedException extends RuntimeException {
        public UnexpectedException(String message) {
            super(message);
        }
    }
}
