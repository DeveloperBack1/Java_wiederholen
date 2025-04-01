package basics;

public class DataTypesDemo {
    public static void main(String[] args) {
        // 1. Объявление и инициализация переменных
        byte age = 25;
        short year = 2024;
        int population = 1_000_000;
        long distanceToMoon = 384_400_000L; // в метрах
        float temperature = 36.6f;
        double pi = 3.1415926535;
        boolean isJavaFun = true;
        char initial = 'J';

        // 2. Вывод значений с описанием
        System.out.println("Возраст: " + age);
        System.out.println("Текущий год: " + year);
        System.out.println("Население города: " + population);
        System.out.println("Расстояние до Луны: " + distanceToMoon + " м");
        System.out.println("Температура тела: " + temperature + " °C");
        System.out.println("Значение числа π: " + pi);
        System.out.println("Java — это интересно? " + isJavaFun);
        System.out.println("Первая буква Java: " + initial);

        // 3. Явное приведение long в int
        int distanceToMoonInt = (int) distanceToMoon;
        System.out.println("Расстояние до Луны (int): " + distanceToMoonInt);

        // Проверяем потерю данных
        long difference;
        difference = distanceToMoon - distanceToMoonInt;
        System.out.println("Потеря данных при приведении: " + difference);

        // 4. Работа с char
        char letter = 'A';
        System.out.println("Буква: " + letter);
        System.out.println("Следующая буква: " + (char) (letter + 1));
        System.out.println("Через две буквы: " + (char) (letter + 2));
        System.out.println("Через три буквы: " + (char) (letter + 3));
    }
}

