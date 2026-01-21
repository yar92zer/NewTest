package org.example.newtest.CodeRetreat.University;

import java.util.*;

public class University {
    public static void main(String[] args) {
        Map<String, Group> university = new LinkedHashMap<>();
        Set<String> uniqueNames = new HashSet<>();
        try {
            Person s1 = new Person("Алексей", 20);
            Person s2 = new Person("Мария", 19);
            Person t1 = new Person("Доктор Иванов", 45);

            StudentGroup students = new StudentGroup();
            TeacherGroup teachers = new TeacherGroup();

            students.addMember(s1);
            students.addMember(s2);
            teachers.addMember(t1);

            Group g1 = students;
            Group g2 = teachers;

            university.put("Студенты", students);
            university.put("Преподаватели", teachers);

            uniqueNames.add(s1.getName().split(" ")[0]);
            uniqueNames.add(s2.getName().split(" ")[0]);
            uniqueNames.add(t1.getName().split(" ")[1]);

            System.out.println("=== УНИВЕРСИТЕТ ===");
            university.values().forEach(Group::showInfo);

            System.out.println("\nУникальные имена: " + uniqueNames);
            System.out.println("Всего людей: " + Person.getTotal());

        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}