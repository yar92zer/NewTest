package org.example.newtest.Studies;

public class Animal {
    private String name;

    public Animal(String name){
        this.name= name;
    }
    public String getName(){
        return name;
    }
    public void stName(String name){
        this.name =name;
    }
    public void makeSound(){
        System.out.println("Some sound");
    }

}
