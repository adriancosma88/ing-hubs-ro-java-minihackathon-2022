package com.coding.problem13;

/**
 * Flipping Cards
 * <p>
 * There are n cards facing down on the table, in organized row.
 * You first flip all the cards on the table, then you flip again every second card.
 * This mean you now have roughly half of the cards facing up and the other ones facing down.
 * <p>
 * On the third round you flip every third card.
 * For the i-th round you flip every i-th card. This means that
 * for the n-th round you only flip the last card.
 * <p>
 * Return the number of cards facing up after n rounds.
 * <p>
 * Example: n=3 -> you start with 3 cards facing down.
 * <p>
 * Input: n = 3
 * Output: 1
 * <p>
 * Explanation: At first, the three cards are [down, down, down].
 * After the first round, the three cards are [up, up, up].
 * After the second round, the three cards are [up, down, up].
 * After the third round, the three cards are [up, down, down].
 * So you should return 1 because there is only one card facing up.
 * <p>
 * n is an integer in the range [1..1_000_000_000]
 */
public class FlippingCards {
    public int flipCards(int n) {
        return -1;
    }
}
