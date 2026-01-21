package org.example.newtest.CodeRetreat.Hospital;

class Doctor extends Person {
    private String specialty;

    public Doctor(String name, int age, String specialty) {
        super(name, age);
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Dr. " + name + " [" + specialty + "]";
    }
}