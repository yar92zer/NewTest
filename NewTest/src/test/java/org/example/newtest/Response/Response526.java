package org.example.newtest.Response;

public class Response526 {
    public static boolean test526(String name,int age,int salary,String country,String gender,int experience){
        if(name.toLowerCase().startsWith("Екатерина")
        && age>=39 && age<=41
        && salary>=61000 && salary<=62000
        && country.equalsIgnoreCase("Австрия")
        && gender.equalsIgnoreCase("Женский")
        && experience==4){
            return true;
        }
        return false;
    }
}
/*Name: "Екатерина"
Age: от 39 до 41
Salary: от 61000 руб до 62000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 4 года*/