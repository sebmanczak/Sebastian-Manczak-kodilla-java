package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(10, "paul52",  'M', LocalDate.of(1962, 12, 24), 101));
        forumUserList.add(new ForumUser(11, "sara45", 'F', LocalDate.of(2005, 01, 20), 0));
        forumUserList.add(new ForumUser(12, "denis206", 'M', LocalDate.of(2007, 5, 31), 0));
        forumUserList.add(new ForumUser(13, "inga77", 'F', LocalDate.of(1980, 4, 5), 44));
        forumUserList.add(new ForumUser(14, "john22", 'M',LocalDate.of(1990, 2, 20), 400));
        forumUserList.add(new ForumUser(15, "Ken66", 'M', LocalDate.of(1966, 4, 39), 22));
        forumUserList.add(new ForumUser(16, "Michael2", 'M', LocalDate.of(2000, 03, 8), 1));
    }
    public List<ForumUser> getUserList() {

        return new ArrayList<>(forumUserList);
    }
}

