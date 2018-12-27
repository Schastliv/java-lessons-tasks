import java.util.Arrays;
import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] arg) {
        Lesson3 lesson3 = new Lesson3();
        lesson3.firstTask();
        lesson3.secondTask();
        lesson3.thirdTask();
    }


    public void firstTask() {

        int x = 30;
        if (x == 10) {
            System.out.print("Значение Х = 10");
        } else if (x == 20) {
            System.out.print("Значение Х = 20");
        } else if (x == 30) {
            System.out.print("Значение Х = 30");
        } else {
            System.out.print("Это оператор else");
        }
    }

    public void secondTask() {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }

    public void thirdTask() {
        char grade = 'C';
        switch (grade) {
            case 'A':
                System.out.println("Отлично!");
                break;
            case 'B':
            case 'C':
                System.out.println("Отлично выполнено!");
                break;
            case 'D':
                System.out.println("Вы прошли");
            case 'F':
                System.out.println("Лучше попробуйте снова");
                break;
            default:
                System.out.println("Неверная оценка");
        }
        System.out.println("Ваша оценка" + grade);
    }
}
