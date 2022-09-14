package com.coding.problem14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NetflixRecommendationTest {
    NetflixRecommendation netflixRecommendation = new NetflixRecommendation();

    @Test
    public void problem14_test1() {
        User[] users = new User[]{new User(1, new int[]{4, 3, 5, 1, 5})};
        Assertions.assertEquals(1, netflixRecommendation.solution(new int[]{3, 4, 4, 1, 4}, users));
    }

    @Test
    public void problem14_test2() {
        User[] users = new User[]{new User(27, new int[]{3, 4, 4, 1, 4})};
        Assertions.assertEquals(27, netflixRecommendation.solution(new int[]{3, 4, 4, 1, 4}, users));
    }

    @Test
    public void problem14_test3() {
        User[] users = new User[]{new User(1, new int[]{1, 2, 3, 4, 5}),
                new User(2, new int[]{4, 3, 5, 1, 5}),
                new User(3, new int[]{2, 5, 1, 3, 1})};
        Assertions.assertEquals(2, netflixRecommendation.solution(new int[]{3, 4, 4, 1, 4}, users));
    }

    @Test
    public void problem14_test4() {
        User[] users = new User[]{new User(1, new int[]{1, 2, 3, 4, 5}),
                new User(2, new int[]{4, 3, 5, 1, 5}),
                new User(3, new int[]{2, 3, 4, 1, 5}),
                new User(4, new int[]{1, 1, 5, 2, 5}),
                new User(5, new int[]{3, 4, 2, 1, 4}),
                new User(6, new int[]{1, 1, 1, 1, 1}),
                new User(7, new int[]{4, 3, 5, 1, 5}),
                new User(8, new int[]{2, 1, 2, 3, 1}),
                new User(9, new int[]{1, 2, 2, 4, 1}),
                new User(10, new int[]{1, 3, 5, 1, 5}),
                new User(11, new int[]{4, 4, 5, 1, 1}),
                new User(12, new int[]{1, 1, 1, 5, 5}),
                new User(13, new int[]{5, 5, 5, 5, 5}),
                new User(14, new int[]{3, 4, 2, 1, 3})};
        Assertions.assertEquals(6, netflixRecommendation.solution(new int[]{1, 1, 1, 1, 1}, users));
    }

    @Test
    public void problem14_test5() {
        User[] users = new User[]{new User(1, new int[]{1, 2, 3, 4, 5}),
                new User(2, new int[]{4, 3, 5, 1, 5}),
                new User(3, new int[]{2, 3, 4, 1, 5}),
                new User(4, new int[]{1, 1, 5, 2, 5}),
                new User(5, new int[]{3, 4, 2, 1, 4}),
                new User(6, new int[]{1, 1, 1, 1, 1}),
                new User(7, new int[]{4, 3, 5, 1, 5}),
                new User(8, new int[]{2, 1, 2, 3, 1}),
                new User(9, new int[]{1, 2, 2, 4, 1}),
                new User(10, new int[]{1, 3, 5, 1, 5}),
                new User(11, new int[]{4, 4, 5, 1, 1}),
                new User(12, new int[]{1, 1, 1, 5, 5}),
                new User(13, new int[]{5, 5, 5, 5, 5}),
                new User(14, new int[]{3, 4, 2, 1, 3})};
        Assertions.assertEquals(13, netflixRecommendation.solution(new int[]{5, 5, 5, 5, 5}, users));
    }

    @Test
    public void problem14_test6() {
        User[] users = new User[]{new User(1, new int[]{1, 2, 3, 4, 5}),
                new User(2, new int[]{4, 3, 5, 1, 5}),
                new User(3, new int[]{2, 3, 4, 1, 5}),
                new User(4, new int[]{1, 1, 5, 2, 5}),
                new User(5, new int[]{3, 4, 2, 1, 4}),
                new User(6, new int[]{1, 1, 1, 1, 1}),
                new User(7, new int[]{4, 3, 5, 1, 5}),
                new User(8, new int[]{2, 1, 2, 3, 1}),
                new User(9, new int[]{1, 2, 2, 4, 1}),
                new User(10, new int[]{1, 3, 5, 1, 5}),
                new User(11, new int[]{4, 4, 5, 1, 1}),
                new User(12, new int[]{1, 1, 1, 5, 5}),
                new User(13, new int[]{5, 5, 5, 5, 5}),
                new User(14, new int[]{3, 4, 2, 1, 3})};
        Assertions.assertEquals(9, netflixRecommendation.solution(new int[]{2, 3, 2, 3, 2}, users));
    }

    @Test
    public void problem14_test7() {
        User[] users = new User[]{new User(1, new int[]{1, 2, 3, 4, 5}),
                new User(2, new int[]{4, 3, 5, 1, 5}),
                new User(3, new int[]{2, 3, 4, 1, 5}),
                new User(4, new int[]{1, 1, 5, 2, 5}),
                new User(5, new int[]{3, 4, 2, 1, 4}),
                new User(6, new int[]{1, 1, 1, 1, 1}),
                new User(7, new int[]{4, 3, 5, 1, 5}),
                new User(8, new int[]{2, 1, 2, 3, 1}),
                new User(9, new int[]{1, 2, 2, 4, 1}),
                new User(10, new int[]{1, 3, 5, 1, 5}),
                new User(11, new int[]{4, 4, 5, 1, 1}),
                new User(12, new int[]{1, 1, 1, 5, 5}),
                new User(13, new int[]{5, 5, 5, 5, 5}),
                new User(14, new int[]{3, 4, 2, 1, 3})};
        Assertions.assertEquals(13, netflixRecommendation.solution(new int[]{4, 4, 4, 4, 4}, users));
    }

    @Test
    public void problem14_test8() {
        User[] users = new User[]{new User(1, new int[]{1, 2, 3, 4, 5}),
                new User(2, new int[]{4, 3, 5, 1, 5}),
                new User(3, new int[]{2, 3, 4, 1, 5}),
                new User(4, new int[]{1, 1, 5, 2, 5}),
                new User(5, new int[]{3, 4, 2, 1, 4}),
                new User(6, new int[]{1, 1, 1, 1, 1}),
                new User(7, new int[]{4, 3, 5, 1, 5}),
                new User(8, new int[]{2, 1, 2, 3, 1}),
                new User(9, new int[]{1, 2, 2, 4, 1}),
                new User(10, new int[]{1, 3, 5, 1, 5}),
                new User(11, new int[]{4, 4, 5, 1, 1}),
                new User(12, new int[]{1, 1, 1, 5, 5}),
                new User(13, new int[]{5, 5, 5, 5, 5}),
                new User(14, new int[]{3, 4, 2, 1, 3})};
        Assertions.assertEquals(14, netflixRecommendation.solution(new int[]{3, 3, 3, 3, 3}, users));
    }

    @Test
    public void problem14_test9() {
        User[] users = new User[]{new User(1, new int[]{1, 2, 3, 4, 5}),
                new User(2, new int[]{4, 3, 5, 1, 5}),
                new User(3, new int[]{2, 3, 4, 1, 5}),
                new User(4, new int[]{1, 1, 5, 2, 5}),
                new User(5, new int[]{3, 4, 2, 1, 4}),
                new User(6, new int[]{1, 1, 1, 1, 1}),
                new User(7, new int[]{4, 3, 5, 1, 5}),
                new User(8, new int[]{2, 1, 2, 3, 1}),
                new User(9, new int[]{1, 2, 2, 4, 1}),
                new User(10, new int[]{1, 3, 5, 1, 5}),
                new User(11, new int[]{4, 4, 5, 1, 1}),
                new User(12, new int[]{1, 1, 1, 5, 5}),
                new User(13, new int[]{5, 5, 5, 5, 5}),
                new User(14, new int[]{3, 4, 2, 1, 3})};
        Assertions.assertEquals(8, netflixRecommendation.solution(new int[]{2, 2, 2, 2, 2}, users));
    }

    @Test
    public void problem14_test10() {
        User[] users = new User[]{new User(1, new int[]{1, 2, 3, 4, 5}),
                new User(2, new int[]{4, 3, 5, 1, 5}),
                new User(3, new int[]{2, 3, 4, 1, 5}),
                new User(4, new int[]{1, 1, 5, 2, 5}),
                new User(5, new int[]{3, 4, 2, 1, 4}),
                new User(6, new int[]{1, 1, 1, 1, 1}),
                new User(7, new int[]{4, 3, 5, 1, 5}),
                new User(8, new int[]{2, 1, 2, 3, 1}),
                new User(9, new int[]{1, 2, 2, 4, 1}),
                new User(10, new int[]{1, 3, 5, 1, 5}),
                new User(11, new int[]{4, 4, 5, 1, 1}),
                new User(12, new int[]{1, 1, 1, 5, 5}),
                new User(13, new int[]{5, 5, 5, 5, 5}),
                new User(14, new int[]{3, 4, 2, 1, 3})};
        Assertions.assertEquals(9, netflixRecommendation.solution(new int[]{1, 3, 1, 4, 2}, users));
    }
}
