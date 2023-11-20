package HomeWork.Lesson_1.Task_1;


import java.util.InputMismatchException;
import java.util.Scanner;

//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class Task1 {
    public static void main(String[] args) {

        int n = input();
        triangular(n);
        productOfNumbers(n);
    }
    public static int input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        while(true){
            try{
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine();
            System.out.println("Ошибка, введите число повторно");
            }
        }
    }
    static void triangular(int n){
        int triangularN = 0;
        for(int i = 0; i <= n; i++) {
            triangularN +=i;
       }
        System.out.printf("n-ое треугольного числа: %d \n", triangularN);
    }

    static void productOfNumbers(int n){
        int productOfNumbersN = 1;
        int i = 1;
        while(i <= n){
            productOfNumbersN *= i;
            i++;
        }
        System.out.printf("Произведение чисел от 1 до n составляет: %d\n", productOfNumbersN);
    }
}



