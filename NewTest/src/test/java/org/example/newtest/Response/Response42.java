package org.example.newtest.Response;

public class Response42 {
    public static boolean test42(String name,int age, int zp,int salary,String country,String gender,int experience){
        if(name.toLowerCase().startsWith("Светлана")
        && age>=30 && age<=34
        && zp>=20000 && zp<=24000
        && country.equalsIgnoreCase("Нидерланды")
        && gender.equalsIgnoreCase("Женский")
        && experience==1){
            return true;
        }
        return false;
    }

}
/*Name: "Светлана"
Age: от 30 до 34
Zp: от 20000 руб до 24000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 1 год*/