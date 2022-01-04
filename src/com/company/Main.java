package com.company;

public class Main {
    // Задание 1
    public static void main(String[] args) {
        // Задание 1
        int start = 1;
        while (start <= 10) {
            System.out.println(start);
            start++;
        }
        System.out.println();
        for (int x = 10; x >= 1; x--) {
            System.out.println(x);
        }
        {
            System.out.println();
        }
        // Задание 2
        for (int y = 5; y <= 31; y = y + 7) {
            System.out.println("Сегодня пятница " + y + " число." + " Необходимо подготовить отчет");
        }
        {
            System.out.println();
        }
        // Задание 3
        int yearСurrent = 2022;
        int yearStart = yearСurrent - 200;
        int yearEnd = yearСurrent + 100;
        for (yearСurrent = yearStart; yearСurrent < yearEnd; yearСurrent++) {
            if (yearСurrent % 79 == 0)
                System.out.println(yearСurrent);
        }
    }
}





















