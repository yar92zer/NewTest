package org.example.newtest.Response;

public class Response6 {
    public boolean test(String name,int age, int zp,String country,String gender,int experience){
        if(name.toLowerCase().startsWith("Р")
        && age >=42 && age <=61
        && zp >=20000 && zp <=35000
        && country.equalsIgnoreCase("Ю")
        && gender.equalsIgnoreCase("Женский")
        && experience==9){
            return true;
        }
        return false;
    }
}
/*Name: "Р"
Age: от 42 до 61
Zp: от 20000 руб до 35000 руб
Country: "Ю"
Gender: "Женский"
Experience: 9 лет*/