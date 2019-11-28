package com.freesme.mediator_pattern;

public class Domain {
    public static void main(String[] args) {
        User robet = new User("Robet");
        User john = new User("John");

        robet.sendMessage("Hi John");
        john.sendMessage("Hello Robert");
    }
}
