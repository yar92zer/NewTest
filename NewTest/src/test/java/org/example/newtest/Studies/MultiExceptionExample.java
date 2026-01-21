package org.example.newtest.Studies;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MultiExceptionExample {
    public static void main(String[] args) {
        try {
            int[] array = new int[5];
            array[10] = 100;

            File file = new File("test.txt");
            FileReader reader = new FileReader(file);
            reader.close();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка доступа к массиву: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка работы с файлом: " + e.getMessage());
        } finally {
            System.out.println("Ресурсы очищины в finally");
        }
    }
}