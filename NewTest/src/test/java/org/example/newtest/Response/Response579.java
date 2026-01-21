package org.example.newtest.Response;

public class Response579 {
    public static boolean test579(String name,int age,int salary,String country,String gender,int experience){
        if(name.toLowerCase().startsWith("Александр")
        && age>=24 && age<=28
        && salary>=44000 && salary<=53000
        && country.equalsIgnoreCase("Венгрия")
        && gender.equalsIgnoreCase("Мужской")
        && experience==5){
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 24 до 28
Salary: от 44000 руб до 53000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 5 лет*/