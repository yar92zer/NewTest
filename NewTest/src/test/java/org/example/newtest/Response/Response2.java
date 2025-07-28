package org.example.newtest.Response;

public class Response2  {
    public static boolean test1(String name,int age, int zp, String country,String gender,int experience) {
        if(name.toLowerCase().startsWith("З")
        && age >=28 && age <=31
        && zp >=29000 && zp <=45000
        && country.equalsIgnoreCase("Т")
        && gender.equalsIgnoreCase("Мужско")
        && experience ==34){
            return true;
        }
        return false;
    }

}
/*Name: "Э"
Age: от 28 до 31
Zp: от 29000 руб до 45000 руб
Country: "Т"
Gender: "Мужской"
Experience: 34 лет*/