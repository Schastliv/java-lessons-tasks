import java.util.Scanner;
import java.util.StringJoiner;

public class Lesson4 {

    public static void main(String[] arg) {
        Lesson4 lesson4 = new Lesson4();
        lesson4.firstTask();
        lesson4.secondTask();
        lesson4.thirdTask();
        lesson4.fourthTask();
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

        for (int i = 1; i < 100; i += 2) {
            System.out.print(i + " ");
        }

    }

    public void thirdTask() {
        int i = 5;
        i = i++;
        System.out.println(i);
        i = 5;
        i = i++ + i++;
        System.out.println(i);
        i = 5;
        i = i++ + ++i;
        System.out.println(i);
        i = 5;
        i = ++i + ++i;
        System.out.println(i);
    }

    public void fourthTask() {
        String src = "I love Norway";
        for (String part : src.split(" ")) {
            System.out.print(new StringBuilder(part).reverse().toString());
            System.out.print(" ");
        }

    }
}

