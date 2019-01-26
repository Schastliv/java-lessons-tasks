package Lesson8;

public class MyFile implements Closable {
    public void close () {
        System.out.println("My file is closing");
    }
}
