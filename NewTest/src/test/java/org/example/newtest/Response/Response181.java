package org.example.newtest.Response;

public class Response181 {
    public static void main(String[] args) {
        double a = 42.571;
        int b = (int) a;
        System.out.println(b);
    }

    public static boolean test181(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Екатерина")
                && age >= 32 && age <= 44
                && salary >= 23000 && salary <= 27000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7) {
            return true;
        }
        return false;
    }
}



/*Name: "Екатерина"
Age: от 32 до 44
Salary: от 23000 руб до 27000 руб
Country: "Франция"
Gender: "Женский"
Experience: 7 лет*/