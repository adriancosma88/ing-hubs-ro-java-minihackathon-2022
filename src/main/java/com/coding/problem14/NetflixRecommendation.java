package com.coding.problem14;

/**
 * When users sign up for Netflix, have them rate some categories of movies based on how much
 * they like those categories. For each user, you now have a set of ratings!
 * <p>
 * There are 5 categories of movies: comedy, action, drama, horror, romance and each user
 * can rate these categories with their interest from 1 to 5.
 * <p>
 * After new users joins you need to help them to choose some movies to watch, by providing
 * some suggestions from movies liked by other users with similar interests.
 * <p>
 * Write a program that finds an existent user is who most likely to share the same preferences
 * with the new signed one. You will as input an array with the preferences of the new user,
 * and a matrix with all other users' ratings. Return the id of the found user.
 */
public class NetflixRecommendation {
    public int solution(int[] newUserRatings, User[] users) {
        return -1;
    }
}

class User {
    int id;
    int[] ratings;

    User(int id, int[] ratings) {
        if (ratings.length != 5)
            throw new IllegalArgumentException("Each user should have exactly 5 category ratings");
        this.id = id;
        this.ratings = ratings;
    }
}
