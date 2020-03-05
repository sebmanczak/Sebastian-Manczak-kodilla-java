package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int userId;
    private final String userName;
    private final char userGender;
    private final LocalDate dateOfBirth;
    private final int publishedPosts;

    public ForumUser(int userId, String userName, char userGender, LocalDate dateOfBirth, int publishedPosts) {
        this.userId = userId;
        this.userName = userName;
        this.userGender = userGender;
        this.dateOfBirth = dateOfBirth;
        this.publishedPosts = publishedPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserGender() {
        return userGender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPublishedPosts() {
        return publishedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userGender=" + userGender +
                ", dateOfBirth=" + dateOfBirth +
                ", publishedPosts=" + publishedPosts +
                '}';
    }
}

