package org.example.newtest.Studies;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Возраст должен быть не менее 18 лет");
        }
        System.out.println("Возраст подходит: "+ age);
    }
    public static void main(String[] args){
        try{
            checkAge(15);
        }catch (InvalidAgeException e){
            System.out.println("Ошибка: "+e.getMessage());
        }
    }
}
