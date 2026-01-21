package org.example.newtest.CodeRetreat.Daliy3;

import java.util.Locale;

class GraduateStudent extends Student {
    private String thesis;

    public GraduateStudent(String name, String email, String thesis) {
        super(name, email);
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return "Graduate: " + name + " (" + email + "), Thesis: " + thesis + ", Avg: " + String.format(Locale.US,"%.1f",getAverageGrade());
    }
}