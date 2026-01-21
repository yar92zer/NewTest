package org.example.newtest.CodeRetreat.SocialNetwork;

import java.util.*;

public class SocialNetwork {
    public static void main(String[] args) {
        Map<User, List<Post>> feed = new HashMap<>();
        Set<String> uniqueUsernames = new HashSet<>();

        try {
            User u1 = new User("alice");
            User u2 = new User("bob");

            u1.gainFollower();
            u1.gainFollower();
            u2.gainFollower();

            Post p1 = new Post(u1, "Hello, world:");
            Post p2 = new Post(u2, "Java is awesome:");

            p1.like();
            p1.like();
            p2.like();

            feed.computeIfAbsent(u1, k -> new ArrayList<>()).add(p1);
            feed.computeIfAbsent(u2, k -> new ArrayList<>()).add(p2);

            uniqueUsernames.add(u1.username);
            uniqueUsernames.add(u2.username);

            System.out.println("=== СОЦСЕТЬ ===");
            feed.forEach((user, posts) -> System.out.println(user + " -> " + posts));
            System.out.println("Уникальные пользователи: " + uniqueUsernames);
            System.out.println("Всего пользователей: " + User.getTotal());
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}