import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.IntStream;

public class Lesson2 {

    public static void main(String[] arg) {
        Lesson2 lesson2 = new Lesson2();
        lesson2.firstTask();
        lesson2.secondTask();
        lesson2.thirdTask();
        lesson2.fourthTask();
        lesson2.fifth();
        lesson2.seven();
        lesson2.eighthTask();
        lesson2.ninthTask();
    }

    public void firstTask() {
        int[] nums1 = new int[]{1, 2, 3, 5};
        int[] nums2 = {1, 2, 3, 5};

        int[] nums = new int[4];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 4;
        nums[3] = 100;

        System.out.println(nums[2]);
    }

    public void secondTask() {
        int[] nums1 = {0, 1, 2, 3, 4, 5};
        int[][] nums2 = {{0, 1, 2}, {3, 4, 5}};
        nums2[1][0] = 44;
        System.out.println(nums2[1][0]);
    }

    public void thirdTask() {
        String str1 = "Меня зовут".concat(" Олег");
        String str2 = "Здраствуй," + "мир" + "!";
        String str3 = "Год " + 2018;
        System.out.print(str1 + "\n" + str2 + "\n" + str3);

    }

    public void fourthTask() {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        double[] nums1 = {23.45, 56.76, 34.76, 86.53, 34.76};
        byte[] nums2 = {43, 54, 65, 88, 23, 32, 56, 89, 58, (byte) 3333};
        System.out.println(nums2[9]);

    }

    public void fifth() {
        byte a = 1;
        int b = 2;
        long c = 3;
        int[] nums = new int[10];
        nums[0] = a;
        nums[1] = b;
        nums[2] = (int) c;

        System.out.println(nums[1]);

    }

    public void sixth() {
        int array[][] = new int[2][5];
        int i, j, k = 1;

        for (i = 0; i < 2; i++) {
            for (j = 0; i < 5; j++) ;

        }

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(array[i][j] + "");
                System.out.print("");
            }
        }
    }

    public void seven() {
        int x=5;
        int y=6;
        System.out.println("x="+x +"; y="+y);

        }

        public void eighthTask() {

        String src = "Мама мыла раму";
        String[] nums = src.split("");
        System.out.println(Arrays.toString(nums));
        }

        public void ninthTask() {

        String src2 = "Я хочу переносы строк";
        String nums = src2.replace("", System.lineSeparator());
        System.out.println(nums);
        }
}
