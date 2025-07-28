package org.example.newtest.Studies;
import java.util.Scanner;

public class MyTest {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        System.out.println(age);
        System.out.println(name+ ":" + age);
    }

}
