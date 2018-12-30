import java.util.Scanner;
import java.util.StringJoiner;

public class Lesson6 {

    public static void main(String[] arg) {
        Lesson6 lesson65 = new Lesson6();
        lesson65.firstTask();

    }

    public void firstTask() {
        MyInt a1;
        MyInt a2;

        a1 = new MyInt(3);
        a2 = a1;

        System.out.println(a1.x + " " + a2.x);
        a1.x = 10;
        System.out.println(a1.x + " " + a2.x);


    }
}
