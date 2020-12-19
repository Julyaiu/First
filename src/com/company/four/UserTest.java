package com.company.four;

public class UserTest {
    public static void main(String[] args) {
        User user = new User("Robert", "Ricls", 34);
        user.update("Robert", "Ricls", 24);
        user.update("Parry", "Ricls", 34);
        user.update("Endy", "Sharel", 13);
    }

}
