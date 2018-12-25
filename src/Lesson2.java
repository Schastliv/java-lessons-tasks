public class Lesson2 {

    public static void main(String[] arg) {
        Lesson2 lesson2 = new Lesson2();
        lesson2.firstTask();
        lesson2.secondTask();
        lesson2.thirdTask();
        lesson2.fourthTask();

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
}
