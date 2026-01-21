package org.example.newtest.Studies;

class NegativeNumberException extends Exception{
    public NegativeNumberException(String message){
        super(message);
    }
}
public class NegativeNumberExample {
    public static void checkPositiveNumber(int number) throws NegativeNumberException{
        if (number <0){
            throw new NegativeNumberException("Число не может быть отрицательным: "+number);
        }
        System.out.println("Число корректно: "+number);
    }
    public static void main(String[] args){
        try{
            checkPositiveNumber(-5);
            checkPositiveNumber(10);
        }catch(NegativeNumberException e){
            System.out.println("Ошибка: "+e.getMessage());
        }finally{
            System.out.println("Проверка завершена (finally)");
        }
    }
}
