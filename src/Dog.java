import com.sun.source.util.SourcePositions;

public class Dog {

    public Dog () {
        System.out.println("Создание Dog");
    }
    public Dog (String src) {
        name = src;
        System.out.println("Создание Dog");
    }

    public String color;
    public int age;
    public String name;
    public  void eat () {
        System.out.println(name + "is eating");
    }
}
