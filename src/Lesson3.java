import java.util.Arrays;
import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] arg) {
        Lesson3 lesson3 = new Lesson3();
        lesson3.firstTask();
        lesson3.secondTask();
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
        System.out.println(a+b);
    }
}
