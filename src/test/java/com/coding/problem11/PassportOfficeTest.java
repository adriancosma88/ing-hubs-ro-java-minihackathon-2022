package com.coding.problem11;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassportOfficeTest {

    private final PassportOffice passportOffice = new PassportOffice();

    @Test
    public void problem11_test1() {
        assertEquals(10, passportOffice.checkTime("Adam", 2,
                List.of("John", "Eric", "Anne", "Eve", "Xavier")));
    }

    @Test
    public void problem11_test2() {
        assertEquals(20, passportOffice.checkTime("Emma", 2,
                List.of("John", "Billy", "Anne", "Eve", "Eric")));
    }

    @Test
    public void problem11_test3() {
        assertEquals(30, passportOffice.checkTime("Xavier", 3,
                List.of("John", "Eric", "Anne", "Eve", "Paul", "Paula")));
    }

    @Test
    public void problem11_test4() {
        assertEquals(40, passportOffice.checkTime("Xavier", 2,
                List.of("John", "Eric", "Anne", "Eve", "Paul", "Paula")));
    }
}
