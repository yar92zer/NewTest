package org.example.newtest.CodeRetreat.University;

class StudentGroup extends Group {
    public StudentGroup() {
        super("Группа студентов");
    }

    @Override
    public void showInfo() {
        System.out.println("=== " + title + " ===");
        members.forEach(p -> System.out.println(" STUDENT: " + p));
    }

    public void addMember(Person p) {
        members.add(p);
    }
}