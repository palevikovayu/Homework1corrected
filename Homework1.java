import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class Homework1 {
    public static void main(String[] args) {
        System.out.println(intToString(1));
        System.out.println(stringToInt("2"));
        isEven(3);
        endsWith(44346, 7);
        contains("Exercise 5", "r");
        recountTime(6);
        timeConversion(21548621);
        caseChange("exercise");
        circumference(9);
        checkIfCircleCoversRectangle(3, 5, 7);
        ageCalculate3(24, 3, 1993);
    }

    public static String intToString(int a) {         //Задача 1
        String a1 = "" + a;
        System.out.println(a1);
        String a2 = Integer.toString(a);
        return a2;

    }

    public static int stringToInt(String b) {           //Задача 2
        int exercise2 = Integer.parseInt(b);
        int b1 = new Integer(b);
        System.out.println(exercise2);
        return b1;
    }

    public static void isEven(int number) {                  //Задача 3
        if ((number % 2) == 0)
            System.out.println("Число " + number + " четное ");
        else
            System.out.println("Число " + number + " нечетное ");
    }

    public static void endsWith(int number, int ending) {                //Задача 4
        int d1 = number % 10;
        if (d1 == ending)
            System.out.println("Число заканчивается цифрой " + ending);
        else
            System.out.println("Число не заканчивается цифрой " + ending);
    }

    public static void contains(String str, String c) {       //Задача 5
        if (str.contains(c)) {
            System.out.println("Строка содержит символ " + c);
        } else {
            System.out.println("Строка не содержит символ " + c);
        }
    }

    public static void recountTime(int f) {             //Задача 6
        int f1 = f * 60;
        int f2 = f * 3600;
        System.out.println("Указанное время в минутах - " + f1 + ", в секундах - " + f2);
    }

    public static void timeConversion(int g) {              //Задача 7
        int g1 = (int) Math.floor(g / 86400);
        int g2 = (int) Math.floor((g - g1 * 86400) / 3600);
        int g3 = (int) Math.floor((g - g1 * 86400 - g2 * 3600) / 60);
        int g4 = g - g1 * 86400 - g2 * 3600 - g3 * 60;
        System.out.println(g + " секунд - это " + g1 + " дней, " + g2 + " часов, " + g3 + " минут и " + g4 + " секунд");
    }

    public static void caseChange(String h) {         //Задача 8 (знаю, что нужно через одну букву, но не получается)
        System.out.println(h.toUpperCase());
    }

    public static void circumference(int r) {             //Задача 9
        final double Pi = 3.14;
        double circuit = 2 * Pi * r;
        double areaOfACircle = Pi * (r ^ 2);
        System.out.println("Длина окружности равна " + circuit);
        System.out.println("Площадь круга равна " + areaOfACircle);
    }

    public static void checkIfCircleCoversRectangle(float side1, float side2, float r) {           //Задача 10
        if (side1 > 0 & side2 > 0 & r > 0) {
            boolean compare = false;
            float diameter = 2 * r;
            double diagonal = Math.sqrt((side1 * side1) + (side2 * side2));
            compare = (diameter >= diagonal);
            if (compare == true) {
                System.out.println("Картонка закрывает отверстие");
            } else {
                System.out.println("Картонка не закрывает отверстие");
            }
        } else {
            System.out.println("Неверные данные");
        }
    }

    public static void ageCalculate3(int day, int month, int year) {           //Задача 11
        LocalDate age = LocalDate.now().minus(Period.of(year, month, day));
        System.out.println("Ваш возраст составляет: " + age.getYear() + " лет " + age.getMonthValue() + " месяцев " + age.getDayOfMonth() + " дней");
    }
}

