package com.kodilla.testing.forum.statistics;

public class StatisticsProcessor {
    int usersCount;
    int postsCount;
    int commentsCount;
    double avgPostsPerUser;
    double avgCommentsPerUser;
    double avgCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        if (usersCount != 0) {
            avgPostsPerUser = postsCount / (double) usersCount;
            avgCommentsPerUser = commentsCount / (double) usersCount;
        }
        if (postsCount != 0) {
            avgCommentsPerPost = commentsCount / (double) postsCount;
        }
    }
    public void showStatistics(Statistics statistics) {
        System.out.println(usersCount);
        System.out.println(postsCount);
        System.out.println(commentsCount);
        System.out.println(avgPostsPerUser);
        System.out.println(avgCommentsPerUser);
        System.out.println(avgCommentsPerPost);
    }

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }
}
