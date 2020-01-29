package com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;

public class ForumUser {
    private String name;
    private String realName;
    private ArrayList<ForumPost> posts = new ArrayList<ForumPost>();
    private LinkedList<ForumComment> comments = new LinkedList<ForumComment>();

    public ForumUser(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }
    public void addPost(String author, String postBody) {

    }
    public void addComment(ForumPost thePost, String author, String commentBody) {

    }
    public int getPostsQuantity() {
        return 100;
    }
    public int getCommentsQuantity() {
        return 100;
    }
    public ForumPost getPost(int postNumber) {
        return null;
    }
    public ForumComment getComment(int commentNumber) {
        return null;
    }
    public boolean removePost(ForumPost thePost) {
        return true;
    }
    public boolean removeComment(ForumPost thePost) {
        return true;
    }
    public String getName() {
        return realName;
    }
    public String getRealName() {
        return realName;
    }
}
