import java.util.Arrays;
import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] arg) {
        Lesson3 lesson3 = new Lesson3();
        lesson3.firstTask();
        lesson3.secondTask();
        lesson3.thirdTask();
        lesson3.fourthTask();
        lesson3.fifthTask();
        lesson3.sixthTask();
        lesson3.sevenTask();
        lesson3.eighthTask();
        lesson3.ninthTask();
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

    public void fourthTask() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " ");
        }
    }

    public void fifthTask() {

        int[] arr = {15, 4, 6, 12, 52, 7, 9, 8, 93, 25};
        for (int x = 0; x < arr.length; x++)
            for (int y = x + 1; y < arr.length; y++) {
                if (arr[y] > arr[x]) {
                    int temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;

                    for (byte arrIndex = 0; arrIndex < arr.length; arrIndex++) {
                        System.out.print(arr[arrIndex] + " ");
                    }
                }
            }
    }

    public void sixthTask() {

        int i = 1;
        do {
            System.out.println("i = " + 1);
            i++;
        } while (i < 11);
    }

    public void sevenTask() {
        int[] array = {2, 3, 5, 8, 10, 11, 14, 15, 18, 20};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("Index: " + i + "; Number: " + array[i]);
            }
        }
    }

    public void eighthTask() {
        int [] a = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d\n", a [i]);
        }

    }

    public void ninthTask() {
        String src = "Роняет лес багряный свой убор, Сребрит мороз увянувшее поле, Проглянет день как будто поневоле И скроется за край окружных гор.";
        System.out.println("\n");
    }
    }
