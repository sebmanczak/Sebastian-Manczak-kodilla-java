package com.kodilla.good.patterns.challenges;

public class Buyer {
    String login;
    String firstName;
    String lastName;
    String email;

    public Buyer(String login, String firstName, String lastName, String email) {
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Login: \"" + login + "\"" +
                ", Name: \"" + firstName + " " +
                 lastName + '\"' +
                ", email: \"" + email + '\"';
    }
}
