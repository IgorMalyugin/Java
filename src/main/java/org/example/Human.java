package org.example;

import javax.swing.*;
import java.util.*;

public class Human {

    private String name;
    private int age;
    private boolean isCute;
//    private Human friends;
//    private List<Human> friends = new ArrayList<>();
    private Map<String, Human> friends = new HashMap<>();
    public Human(String name, int age, boolean isCute) {
        this.name = name;
        this.age = age;
        this.isCute = isCute;
    }

    public void addFriend(Set<Human> friends) {
        for (Human friend:friends) {
            this.friends.put(friend.name, friend);
        }
    }


    public void printAllFriends() {
        for (Human friend : friends.values()) {
            System.out.println(friend);
        }
    }

    public void printFriendsByName(String name) {
            Human human = friends.get(name);
            if (human != null){
                System.out.println(human);
            }

//        for (Human friend : friends) {
//            if (friend.name.equals(name)) ;
//            System.out.println(friend);
//            return;
//        }

//        int index = 0;
//        while (index < friends.length) {
//            Human friend = friends[index];
//            if (friend.name.equals(name)) {
//                System.out.println(friend);
//                return;
//            }
//            index++;


//        for (int i = 0; i < friends.size(); i++) {
//            Human friend = friends.get(i);
//            if (friend.name.equals(name)) {
//                System.out.println(friend);
//                return;
//            }
//            System.out.println("друзей не найдено");
//        }
    }


    public int increaseAge() {
        this.age++;
        return age;
    }


    @Override
    public String toString() {
        return name + " возраст - " + age + " симпатичный - " + isCute + " друг: " + friends;
    }
}
