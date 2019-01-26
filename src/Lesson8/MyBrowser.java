package Lesson8;

public class MyBrowser implements Closable {
    public void close () {
        System.out.println("My Browser is closing");
    }
}
