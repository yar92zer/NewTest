package org.example.newtest.CodeRetreat.Daliy3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

class Student extends Person {
    protected String email;
    protected List<Integer> grades;
    private static int totalStudents = 0;

    public Student(String name, String email) {
        super(name);
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }
        this.email = email;
        this.grades = new ArrayList<>();
        totalStudents++;
    }

    public void addGrade(int grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be 0-100");
        }
        grades.add(grade);
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) return 0.0;
        return
                grades.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public static int getTotalStudents() {
        return Student.totalStudents;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Student: " + name + " (" + email + "), Avg: " + String.format(Locale.US,"%.1f", getAverageGrade());
    }
}