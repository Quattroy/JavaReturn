package ru.geekbrains.lesson_1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
    printName();
    task2();
    }
    /*
    * Написать программу, которая запросит
    * пользователя ввести "Имя" в консоли.
    * Получит введеную строку и выведет в консоль сообщение "Привет, "Имя!".
     */
    static void printName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользоватлея: ");
        String name = scanner.nextLine();
        System.out.println("Привет, " + name + "!");
        System.out.printf("Привет, %s !\n",name);
    }
    static void task2(){
        /*
        Дан массив двоичных чискл, например [1, 1, 0, 1, 1, 1, 0, 1],
        вывести максимальное количество подряд илущих 1.
         */
        int [] arr = new int[] {1, 1, 0, 1, 1, 1, 0, 1};
        int max = 0;
        int num = 0;
        for(int i : arr){
            if(i == 1){
                num++;}
            else {
                if(max < num){
                    max = num;
                    num = 0;
                }
                }
            }
        System.out.printf("Максимальное количество подряд идущих 1 равно: %d", max);
        }

    /*
    Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
     */
    //сделать сплит по пробелу/ 1 час 59 минут
    static void task3(String str){
        for(int i = 0, j = 10; i < j; i++){
            System.out.printf("i=%d - j=%d\n", i, j);
        }

        String[] words = str.split(" ");

    }
    }
