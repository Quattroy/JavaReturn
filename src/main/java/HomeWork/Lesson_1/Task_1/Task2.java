package HomeWork.Lesson_1.Task_1;


//Вывести все простые числа от 1 до 1000 (простое числе делится толкьо на 1 и на себя)
public class Task2 {
    public static void main(String[] args) {
        simpleNumber();
    }

    public static void simpleNumber() {
        for(int i = 2; i <= 1000; i++) {
            boolean simple = false;
            for(int j = 2; j*j <= i; j++) { // перебираем все i до того момента, пока i в квадрате не станет равно числу j
                simple = i % j == 0;
                if(simple){
                    break;
                }
            }
            if(!simple) {
                System.out.print(i + " ");
            }
        }
    }
}
