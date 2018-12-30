package Lesson7;

import java.awt.*;

public class Ellement {
    private int x;
    private int y;
    private String cssClass;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {

        if (x < 0) {
            System.out.println("error");
        } else {
            this.x = x;
        }

    }

    public void setY(int y) {

        if (x < 0) {
            System.out.println("error");
        } else {
            this.y = y;

        }

    }

    public String getCssClass() {
        return cssClass;
    }

    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;

        if (cssClass == null) {
            System.out.println("error");
        } else {
            this.cssClass = cssClass;
        }

    }

    public Ellement() {

    }

    public Ellement(int x, int y) {
        setX(x);
        setY(y);
    }

    public void select() {
        System.out.println("Ellement selected");
    }
}