import java.util.Arrays;

public class Lesson3 {

    public static void main(String[] arg) {
        Lesson3 lesson3 = new Lesson3();
        lesson3.firstTask();
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
}
