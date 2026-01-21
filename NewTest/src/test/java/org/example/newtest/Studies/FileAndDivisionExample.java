package org.example.newtest.Studies;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileAndDivisionExample {
    public static void main(String[] args) {
        try {
            int result = 100 / 0;
            File file = new File("missing.txt");
            FileReader reader = new FileReader(file);
            reader.close();
        } catch (ArithmeticException e) {
            System.out.println("Ошибка деления: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка файла: " + e.getMessage());
        } finally {
            System.out.println("Операции завершены (finally)");
        }
    }
}
