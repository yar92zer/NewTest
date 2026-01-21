package org.example.newtest.Response;

public class Response649 {
    public static boolean test649(String name,int age,int salary,String country,String gender,int experience){
        if(name.toLowerCase().startsWith("Оксана")
        && age>=27 && age<=32
        && salary>=59000 && salary<=62000
        && country.equalsIgnoreCase("Польша")
        && gender.equalsIgnoreCase("Женский")
        && experience==8){
            return true;
        }
        return false;
    }
}
/*Name: "Оксана"
Age: от 27 до 32
Salary: от 59000 руб до 62000 руб
Country: "Польша"
Gender: "Женский"
Experience: 8 лет*/