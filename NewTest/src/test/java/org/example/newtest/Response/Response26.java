package org.example.newtest.Response;

public class Response26 {
    public static boolean test26(String name, int age,int zp, String country,String gender,int experience){
        if(name.toLowerCase().startsWith("О")
        && age >=24 && age <=34
        && zp >=35000 &&zp <=39000
        && country.equalsIgnoreCase("Ю")
        && gender.equalsIgnoreCase("Женский")
        && experience==20){
            return true;
        }
        return false;
    }
}
/*Name: "О"
Age: от 24 до 34
Zp: от 35000 руб до 39000 руб
Country: "Ю"
Gender: "Женский"
Experience: 20 лет*/