package org.example.newtest.CodeRetreat.Daliy3;

import java.util.*;

public class DailyChallenge3 {
    public static void main(String[] args) {
        Map<String, List<Student>> courses = new HashMap<>();
        Set<String> uniqueEmails = new HashSet<>();

        try {
            Student s1 = new Student("Alice", "alice@university.com");
            s1.addGrade(95);
            s1.addGrade(88);

            GraduateStudent s2 = new GraduateStudent("Bob", "bob@university.com", "AI in Education");
            s2.addGrade(92);
            s2.addGrade(97);

            courses.computeIfAbsent("Java", k -> new ArrayList<>()).add(s1);
            courses.computeIfAbsent("AI", k -> new ArrayList<>()).add(s2);

            uniqueEmails.add(s1.getEmail());
            uniqueEmails.add(s1.getEmail());
            uniqueEmails.add(s2.getEmail());

            System.out.println("=== КУРСЫ ===");
            courses.forEach((course, students) -> System.out.println(course + ": " + students));

            System.out.println("\nУникальные email: " + uniqueEmails);
            System.out.println("Всего студентов: " + Student.getTotalStudents());
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}