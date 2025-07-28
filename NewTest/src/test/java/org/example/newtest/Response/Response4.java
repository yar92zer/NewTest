package org.example.newtest.Response;

public class Response4 {
    public boolean test(String name,int age,int zp,String country,String gender,int experience){
        if(name.toLowerCase().startsWith("И")
        && age >=29 && age <=29
        && zp >=25000 && zp <=27000
        && country.equalsIgnoreCase("О")
        &&gender.equalsIgnoreCase("Мужской")
        && experience==26){
            return true;
        }
        return false;
    }
}
/*Name: "И"
Age: от 29 до 29
Zp: от 25000 руб до 27000 руб
Country: "О"
Gender: "Мужской"
Experience: 26 лет*/