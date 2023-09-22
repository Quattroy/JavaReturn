package ru.geekbrains.lesson_1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        task2();
    }
    static void printName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Привет, " + name + "!");
        System.out.printf("Привет, %s !\n",name);
    }

    /*
    * Дан массив данных чисел, например [1, 1, 0, 1, 1, 1, 0,1 ]
    * вывести ммксимальное количество идущих подряд 1.
     */
    static void task2(){
        int [] arr = new int[] {1, 1, 0, 1, 1, 1, 0, 1} ;
        int count1 = 0;
        int count2 = 0;
        for (int j : arr) {
            if (j == 1) {
                count1 += 1;
            }
            if (count2 < count1) {
                count2 = count1;
                count1 = 0;
            }

        }
        System.out.printf("Максимальное количество подряд идущих единиц составляет: %d\n", count2);
    }
}
