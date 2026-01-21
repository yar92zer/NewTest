package org.example.newtest.CodeRetreat.University;

class TeacherGroup extends Group {
    public TeacherGroup() {
        super("Группа преподавателей");
    }

    @Override
    public void showInfo() {
        System.out.println(">>> " + title + " <<<");
        members.forEach(p -> System.out.println(" TEACHER: " + p));
    }

    public void addMember(Person p) {
        members.add(p);
    }
}