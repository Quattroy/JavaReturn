package HomeWork.Lesson_1.Task_1;

import java.util.Scanner;

public class Calculator {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int number = request();
        System.out.println(number);
        int firstNum = numOfTerminal("Введите первое целочисленное значение: ");
        System.out.println(firstNum);
        int secondNum = numOfTerminal("Введите второе целочисленное значение: ");
        System.out.println(secondNum);
        operation(number, firstNum, secondNum);




    }
    /* Выполняем запрос на вид операции, которую необходимо будет осуществить.
    Проверяем число на корректно ввода, потом проверяем на непривышение диапазона
    по пунктам и возвращаем число в функцию.
     */

    public static int request() {  // нужно исправить так, чтобы при вводе 0 програма завершалась на данном этапе!
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
    /*
    Метод запроса у пользователя значения с последующей его проверкой на корректность ввода
     */
        public static int numOfTerminal(String message) {
            boolean flag = true;
            int num = 0;
            while (flag) {
                System.out.println(message);
                if (s.hasNextInt()) {
                    num = s.nextInt();
                    flag = false;
                } else {
                    System.out.println("Вы ввели некорректное число, повторите попытку: ");
                    s.next();
                }

            }
            return num;
        }



/*
Функция для выбора вида операции и переключения на нужную
 */
        public static void operation(int number, int firstNum, int secondNum) {
            switch (number) {
                case 1:
                    addition(firstNum, secondNum);
                    break;
                case 2:
                    deduction(firstNum, secondNum);
                    break;
                case 3:
                    multiplication(firstNum, secondNum);
                    break;
                case 4:
                    divide(firstNum, secondNum);
                    break;
                case 0:
                    System.out.println("Завершение работы приложения.");
                    break;
            }
        }

        public static void addition(int firstNum, int secondNum) {
            int sum = firstNum + secondNum;
            System.out.printf("Сумма числа %d и числа %d составляет: %d\n", firstNum, secondNum, sum);
        }

        public static void deduction(int firstNum, int secondNum){
            int rez = firstNum - secondNum;
            System.out.printf("Разница между числом %d и числом %d составляет: %d\n", firstNum, secondNum, rez);
        }

        public static void multiplication(int firstNum, int secondNum){
            int rez = firstNum * secondNum;
            System.out.printf("Умножение числа %d на число %d составит: %d\n", firstNum, secondNum, rez);
        }

        public static void divide(int firstNum, int secondNum){
            int rez = firstNum / secondNum;
            System.out.printf("Деление числа %d на число %d составит: %d\n", firstNum, secondNum, rez);
        }
}
