package com.coding.problem13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FlippingCardsTest {
    FlippingCards flippingCards = new FlippingCards();

    @Test
    public void problem13_test1() {
        assertEquals(1, flippingCards.flipCards(1));
    }

    @Test
    public void problem13_test2() {
        assertEquals(2, flippingCards.flipCards(4));
    }

    @Test
    public void problem13_test3() {
        assertEquals(3, flippingCards.flipCards(10));
    }

    @Test
    public void problem13_test4() {
        assertEquals(4, flippingCards.flipCards(18));
    }

    @Test
    public void problem13_test5() {
        assertEquals(17, flippingCards.flipCards(300));
    }

    @Test
    public void problem13_test6() {
        assertEquals(20, flippingCards.flipCards(420));
    }

    @Test
    public void problem13_test7() {
        assertEquals(4820, flippingCards.flipCards(23_232_923));
    }
}
