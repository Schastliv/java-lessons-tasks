package Lesson8;

public class Lecture8 {
    public static void finishWork(Closable closableObject) {
        closableObject.close();
    }

    public static void main(String[] args) {
        MyBrowser browser = new MyBrowser();
        MyFile file = new MyFile();
        finishWork(browser);
        finishWork(file);

        finishWork(new Closable() {
            @Override
            public void close() {
                System.out.println("In anonimous class");


            }
        }

        );
    }
}