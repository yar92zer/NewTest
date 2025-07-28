package org.example.newtest.Response;

public class Response17 {
    public static boolean test17(String name,int age,int zp,String country,String gender,int experience){
        if (name.toLowerCase().startsWith("Т")
        && age >= 30 && age <= 30
        && zp>=23000 && zp<=27000
        && country.equalsIgnoreCase("Ж")
        && gender.equalsIgnoreCase("Женский")
        && experience==1){
            return true;
        }
        return false;
    }
}
/*Name: "Т"
Age: от 30 до 30
Zp: от 23000 руб до 27000 руб
Country: "Ж"
Gender: "Женский"
Experience: 1 год*/