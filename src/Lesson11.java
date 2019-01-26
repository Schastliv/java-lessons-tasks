import java.lang.reflect.Array;
import java.util.*;

public class Lesson11 {

//    public static void main(String[] args) {
//
//        List<Integer> myList = new ArrayList<>();
//        myList.add(2);
//        myList.add(1);
//        myList.add(6);
//        myList.add(0);
//
////        for (int j = 0; j < myList.size() - 1; j++) {
////            for (int i = 0; i < myList.size() - 1; i++) {
////                if (myList.get(i) > myList.get(i + 1)) {
////                    Integer temp = myList.get(i + 1);
////                    myList.set(i + 1, myList.get(i));
////                    myList.set(i, temp);
////                }
////            }
////        }
//       System.out.println(myList);
//
//        Collections.sort(myList, new Comparator<Integer>() {
//                    @Override
//                    public int compare(Integer integer, Integer t1) {
//                        return 0;
//                    }
//                });
//                System.out.println(myList);
//    }
//}

    public static class Execute {

        public static void main(String[] args) {

            Map<Integer, String> myMap = new LinkedHashMap<>();
            myMap.put(3, "tree");
            myMap.put(4, "four");

            System.out.println(myMap);

            for (Map.Entry<Integer, String> pair : myMap.entrySet()) {
                System.out.println("Ключ: " + pair.getKey());
                System.out.println("Значение: " + pair.getValue());
                System.out.println("........");

            }

            Map<String, String> myMap1 = new LinkedHashMap<>();
            myMap1.put("привет", "hello");

            System.out.println(myMap1);


            Map<String, String> myMap2 = new LinkedHashMap<>();
            Scanner scan = new Scanner(System.in);
            String inputString = scan.nextLine();
            System.out.println("Вы ввели слово в консоли на русском");


            Map<String, String> myMap3 = new LinkedHashMap<>();
            Scanner scan1 = new Scanner(System.in);
            String inputWord = scan.nextLine();
            System.out.println(myMap3.get(inputWord));


            Map<String, String> myMap4 = new LinkedHashMap<>();
            Scanner scan2 = new Scanner(System.in);
            String inputWord1 = scan.next();
            if (!myMap4.containsKey(inputWord1)) {
                System.out.println(myMap4.get(inputWord));
            } else {
            }
            System.out.println("Такого слова нет в словаре");


            Map<String, String> myMap5 = new LinkedHashMap<>();
            Scanner scan3 = new Scanner(System.in);
            String inputWord2 = scan.next();
            if (inputWord2.equalsIgnoreCase("добавить")) {
                System.out.println("Введите новое слово на русском");
                System.out.println(myMap4.get(inputWord));
            } else {
            }
            System.out.println("Такого слова нет в словаре");

        }


    }
}

