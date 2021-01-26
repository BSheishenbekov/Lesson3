package com.company;
import java.util.Random;

/*ДЗ на сообразительность:
● Написать метод в котором генерируется случайный возраст public static int
generateRandomAge(){........}
● При вызове метода, который формирует результат “можно ли идти гулять”
использовать генерирование случайного возраста с помощью метода
“generateRandomAg*/

public class Main {

    public static void main(String[] args) {

        System.out.println(walk(5,15));
        System.out.println(walk(25,55));
        System.out.println(walk(2,0));
        System.out.println(walk(35,-10));
        System.out.println(walk(65, -20));
        mayIgoToWalk();
    }

    public static String walk (int age, int temperature) {

        if (temperature >= -20 && temperature <= 30 && age >= 20 && age <= 45) {
            return "Можно идти гулять";
        } else if (temperature >= 0 && temperature <= 28 && age < 20) {
            return "Можно идти гулять";
        } else if (temperature >= -10 && temperature <= 25 && age > 45) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
    //Бекжан кот

    public static void mayIgoToWalk () {
        System.out.println("Age: ");
        //System.out.println(generateRandomAge());
    }

    public static int generateRandomAge(int min, int max) {
        return new Random().nextInt((max - min) + 1) + min;

    }
}
