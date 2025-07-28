package org.example.newtest.Response;

public class Response184 {
    public static boolean test184(String name, int age, int salary, String country, String gendr, int experinece) {
        if (name.toLowerCase().startsWith("Ольга")
                && age >= 20 && age <= 36
                && salary >= 32000 && salary <= 43000
                && country.equalsIgnoreCase("Австрия")
                && gendr.equalsIgnoreCase("Женский")
                && experinece == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Ольга"
Age: от 20 до 36
Salary: от 32000 руб до 43000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 4 года*/