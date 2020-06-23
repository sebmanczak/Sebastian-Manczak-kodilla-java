package com.kodilla.testing.forum.statistics;

import java.util.List;

public interface Statistics {
    List<String> usersNames();  // list of users names
    int postsCount();           // total quantity of furum posts
    int commentsCount();        // total quantity of forum comments

}
