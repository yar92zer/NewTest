package org.example.newtest;

import java.util.Random;

public class DataGenerator {
    private static final Random random = new Random();
    private static final String[] GENDERS = {"Мужской", "Женский"};
    private static final String[] COUNTRIES = {
            "Австрия", "Бельгия", "Венгрия", "Германия", "Франция",
            "Италия", "Испания", "Нидерланды", "Польша", "Чехия"
    };
    private static final String[] MALE_NAMES = {
            "Александр", "Дмитрий", "Максим", "Сергей", "Андрей",
            "Иван", "Михаил", "Николай", "Егор", "Артем"
    };
    private static final String[] FEMALE_NAMES = {
            "Анна", "Мария", "Екатерина", "Оксана", "Наталья",
            "Елизавета", "Светлана", "Юлия", "Виктория", "Алина"
    };

    // Генерация имени с учетом пола
    public String generateName(String gender) {
        if (gender.equals("Мужской")) {
            return MALE_NAMES[random.nextInt(MALE_NAMES.length)];
        } else {
            return FEMALE_NAMES[random.nextInt(FEMALE_NAMES.length)];
        }
    }

    // Генерация возраста
    public String generateAge() {
        int minAge = 18;
        int maxRange = 25 + random.nextInt(41); // Случайный максимум от 25 до 65

        // Генерируем минимальный возраст
        int minRange = minAge + random.nextInt(maxRange - minAge);
        // Максимальный возраст должен быть хотя бы на 1 больше минимального
        int maxRangeValue = minRange + 1 + random.nextInt(maxRange - minRange);

        return "от " + minRange + " до " + maxRangeValue;
    }

    // Генерация зарплаты
    public String generateSalary() {
        int minSalary = 20000;
        int maxSalary = 30000 + random.nextInt(41) * 1000; // 30000-70000 с шагом 1000

        // Генерируем минимальную зарплату
        int minRange = minSalary + random.nextInt((maxSalary - minSalary) / 1000) * 1000;
        // Максимальная зарплата должна быть хотя бы на 1000 больше минимальной
        int maxRangeValue = minRange + 1000 + random.nextInt((maxSalary - minRange) / 1000) * 1000;

        return "от " + minRange + " руб до " + maxRangeValue + " руб";
    }

    // Генерация страны
    private String generateCountry() {
        return COUNTRIES[random.nextInt(COUNTRIES.length)];
    }

    // Генерация пола
    private String generateGender() {
        return GENDERS[random.nextInt(GENDERS.length)];
    }

    // Генерация опыта работы
    private String generateExperience(int minAge, int maxAge) {
        int maxPossibleExperience = maxAge - 18; // Максимальный возможный опыт
        int maxExperience = Math.min(maxPossibleExperience, 15); // Ограничиваем 15 годами
        int years;

        if (minAge == 18) {
            do {
                years = 1 + random.nextInt(maxExperience); // Диапазон от 1 до maxExperience
            } while (years == 5); // Если минимальный возраст 18, опыт не может быть 5 лет
        } else {
            years = 1 + random.nextInt(maxExperience); // Диапазон от 1 до maxExperience
        }

        if (years == 1) return "1 год";
        if (years == 2 || years == 3 || years == 4) return years + " года";
        return years + " лет";
    }

    // Метод для генерации полной задачи
    public void generateTask() {
        String ageRange = generateAge();
        // Извлекаем минимальный и максимальный возраст из строки вида "от X до Y"
        String[] ageParts = ageRange.split(" ");
        int minAge = Integer.parseInt(ageParts[1]);
        int maxAge = Integer.parseInt(ageParts[3]);
        // Генерируем пол
        String gender = generateGender();
        // Генерируем имя с учетом пола
        String name = generateName(gender);

        System.out.println("Name: \"" + name + "\"");
        System.out.println("Age: " + ageRange);
        System.out.println("Salary: " + generateSalary());
        System.out.println("Country: \"" + generateCountry() + "\"");
        System.out.println("Gender: \"" + gender + "\"");
        System.out.println("Experience: " + generateExperience(minAge, maxAge));
    }

    public static void main(String[] args) {
        DataGenerator generator = new DataGenerator();
        generator.generateTask();
    }
}