package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getUserGender() == 'M')
                .filter(forumUser -> ChronoUnit.YEARS.between(forumUser.getDateOfBirth(), LocalDateTime.now()) > 20)
                .filter(forumUser -> forumUser.getDateOfBirth().plusYears(20).isBefore(LocalDate.now()))
                .filter(forumUser -> Period.between(forumUser.getDateOfBirth(), LocalDate.now()).getYears() > 20)
                .filter(forumUser -> forumUser.getPublishedPosts() > 1)
                .collect(Collectors.toMap(
                        ForumUser::getUserId,
                        forumUser -> forumUser
                )).entrySet()
                .forEach(System.out::println);
    }
}
