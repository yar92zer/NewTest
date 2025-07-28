package org.example.newtest.Response;

public class Response9 {
    public static boolean test9(String name, int age, int zp, String country, String gender, int experience){
    if (name.toLowerCase().startsWith("З")
    && age >=21 && age <=52
    && zp >=26000 && zp <=35000
    && country.equalsIgnoreCase("Ш")
    && gender.equalsIgnoreCase("Женский")
    && experience ==31){
        return true;
    }
    return false;
    }
}
/*Name: "Э"
Age: от 21 до 52
Zp: от 26000 руб до 35000 руб
Country: "Ш"
Gender: "Женский"
Experience: 31 лет
 */