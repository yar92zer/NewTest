package org.example.newtest.Collection;

import java.util.*;

public class WorkingTestFour {
    public static void main(String[] args) {
        String text = "Hello123";
        boolean hasDigits = false;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isDigit(c)) {
                hasDigits = true;
                break;
            }
        }
        System.out.println(hasDigits);
    }
}