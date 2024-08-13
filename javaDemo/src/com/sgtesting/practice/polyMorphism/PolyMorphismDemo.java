package com.sgtesting.practice.polyMorphism;
abstract class Figure
{
    abstract void calaculateArea();
}
class Square extends Figure
{
    void calaculateArea()
    {
        int side=5;
        System.out.println("AreaOfSquare: "+(side*side));
    }
}

class Rectangle extends Figure
{
    void calaculateArea()
    {
        int length=6;
        int breadth=8;
        System.out.println("calaculateAreaOfRectangle:+ "+(length*breadth));
    }
}

class Circle extends Figure {


    void calaculateArea() {
        double pi = 3.14;
        int r = 5;
        System.out.println("calaculateArea of circle: " + (pi * r * r));
    }

}

public class PolyMorphismDemo {
    public static void main(String[] args) {


    Figure figure=null;

    Square squre=new Square();
    Rectangle rect=new Rectangle();
    Circle cir=new Circle();

    figure=squre;
    figure.calaculateArea();

    figure=rect;
    figure.calaculateArea();

    }
}

