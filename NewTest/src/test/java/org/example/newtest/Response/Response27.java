package org.example.newtest.Response;

public class Response27 {
    public static boolean test27(String name,int age,int zp,String country,String gender,int experience){
        if(name.toLowerCase().startsWith("Л")
        && age>=30 && age<=32
        && zp>=34000&& zp<=53000
        && country.equalsIgnoreCase("E")
        && gender.equalsIgnoreCase("Женский")
        && experience==19){
            return true;
        }
        return false;
    }
}
/*Name: "Л"
Age: от 30 до 32
Zp: от 34000 руб до 53000 руб
Country: "Е"
Gender: "Женский"
Experience: 19 лет*/