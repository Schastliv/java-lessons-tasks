public class Lesson9 {
    public static void main(String[] args) {
//        tryException("string");
//        tryException(8);
//
//    }
//
//    public static void tryException(Object obj) {
//        if (!(obj instanceof String)) {
//            throw new IllegalArgumentException("Обьект не строка");
//        }
//    }


    }

    public static void methodM() {
        throw new IllegalArgumentException();
    }

    public static void methodB() {
        throw new NullPointerException();
    }
}