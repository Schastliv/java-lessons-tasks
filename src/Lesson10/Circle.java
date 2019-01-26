package Lesson10;

public class Circle extends Shape {
    private Point cender;

    private double radius;



    public Circle(Point a, double r) throws CloneNotSupportedException {
        setCircle(a, r);
    }

    public Circle(double r){
        this.radius = r;
        if (r<0){
            throw new IllegalArgumentException();
        }

    }

    public void setCircle(Point a, double r) throws CloneNotSupportedException {
        this.cender = a.clone();
        this.radius = r;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimetr() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}