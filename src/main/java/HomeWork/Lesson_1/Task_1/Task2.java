package HomeWork.Lesson_1.Task_1;


//Вывести все простые числа от 1 до 1000 (простое числе делится толкьо на 1 и на себя)
public class Task2 {
    public static void main(String[] args) {
        simpleNumber();
    }

    public static void simpleNumber() {
//        int[] arr = new int[];
//        int count = 0;
//        int num;

        for(int i = 2; i <= 1000; i ++) {
            for(int j = 2; j <= i; j ++) {
                if(i % j != 0) {
                    j++;}
                else {
                    System.out.println(i + " ");
                    break;}



            }

        }
    }
}
