package HomeWork.Lesson_1.Task_1;

import java.util.Scanner;

public class Calculator {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int number = request();
        System.out.println(number);
        operation();


    }

    public static int request() {
        System.out.println("Уважаемый пользователь!\nДобро пожаловать в Калькулятор.\n" +
                "Выберите операцию, которую хотите совершить:\n" +
                "Для операции СЛОЖЕНИЕ введите: 1\n" +
                "Для операции ВЫЧИТАНИЕ введите: 2\n" +
                "Для операции УМНОЖЕНИЕ введите: 3\n" +
                "Для операции ДЕЛЕНИЕ введите: 4\n\n" +
                "Для выохда из программы введите: 0.\n\n" +
                "Введите номер операции: ");
        boolean flag = true;
        int num = 0;
        while (flag) {
            if (s.hasNextInt()) {
                num = s.nextInt();
                if (num >= 0 && num <= 4) {
                    flag = false; //Если число корректное, выходим из цикла
                } else {
                    System.out.println("Вы ввели некорреткное значение! Повторите еще раз!");
                }
            }else{
                    System.out.println("Вы ввели некорреткное значение! Повторите еще раз!");
                s.next(); // Очищаем ввод, чтобы избежать зацикливания
                }

            }
        return num;

        }

        public static void operation(int number) {
            switch (number) {
                case 1:
                    addition();
                    break;
                case 2:
                    deduction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    divide();
                    break;
                case 0:
                    System.out.println("Завершение работы приложения.");
                    break;
            }
        }

        public static void addition() {

        }

}
