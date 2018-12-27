import java.util.Scanner;

public class Lesson4 {

    public static void main(String[] arg) {
        Lesson4 lesson4 = new Lesson4();
        lesson4.firstTask();
        lesson4.secondTask();
        lesson4.thirdTask();
    }

    public void firstTask() {
        int a = 60;
        int b = 13;
        int c = 0;

        c = a & b;
        System.out.println("a & b");

        c = a | b;
        System.out.println("a | b = " + c);

        c = a ^ b;
        System.out.println("a ^ b = " + c);

        c = ~a;
        System.out.println("~ a = " + c);

        c = a << 2;
        System.out.println("a << 2 = " + c);

        c = a >> 2;
        System.out.println("a >> 2 = " + c);

        c = a >>> 2;
        System.out.println("a >>> 2 = " + c);


    }

    public void secondTask() {
        int x = 3;
        int y = 4;
        System.out.println(x + y);
        System.out.println(x * y);
        System.out.println("xy");

    }

    public void thirdTask() {
for (int i = 2; i < 100; i+=2){
    System.out.println(i + " ");
}

    }
}

