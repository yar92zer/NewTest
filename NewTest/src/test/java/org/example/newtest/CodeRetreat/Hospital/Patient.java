package org.example.newtest.CodeRetreat.Hospital;

class Patient extends Person {
    private String diagnosis;

    public Patient(String name, int age, String diagnosis) {
        super(name, age);
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient: " + super.toString() + " [" + diagnosis + "]";
    }
}
