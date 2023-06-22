package org.example;

import com.sun.source.doctree.SeeTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MainOOP {


    public static void main(String[] args) {
        Human igor = new Human("Igor", 35, true);
        Human dima = new Human("Dmitry", 36, true);
        Human keis = new Human("Keysi", 40, true);
        Human kon = new Human("Kon", 20, true);
        Human henk = new Human("Henk", 31, true);

        Human[] friends = new Human[]{dima, keis};
        Set<Human> friendsList = Set.of(dima, keis);
        Set<Human> ExtrafriendsList = Set.of(kon, henk);

        igor.addFriend(friendsList);
        igor.addFriend(ExtrafriendsList);
        igor.printAllFriends();
//        igor.printFriendsByName("Dmitry");
//        igor.printFriendsByName("Keysi");

        igor.increaseAge();

//        System.out.println(igor.toString());
//        System.out.println(dima.toString());


    }
}
