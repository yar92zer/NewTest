package org.example.newtest.Response;

public class Response30 {
    public static boolean test30(String name, int age,int zp,String country,String gender,int experience){
        if(name.toLowerCase().startsWith("H")
        && age>=21&& age <=36
        && zp>=30000&& zp<=46000
        && country.equalsIgnoreCase("Венгрия")
        && gender.equalsIgnoreCase("Мужской")
        && experience==3){
            return true;
        }
        return false;
    }
}
/*Name: "Н"
Age: от 21 до 36
Zp: от 30000 руб до 46000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 3 года*/