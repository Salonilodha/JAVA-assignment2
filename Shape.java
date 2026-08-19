import java.io.*;

abstract class Shape
{
    abstract void calculateArea();
    abstract void calculatePerimeter();
}

class Circle extends Shape
{
    double r;

    Circle(double r)
    {
        this.r = r;
    }

    void calculateArea()
    {
        System.out.println("Circle Area: " + (3.14 * r * r));
    }

    void calculatePerimeter()
    {
        System.out.println("Circle Perimeter: " + (2 * 3.14 * r));
    }
}

class Rectangle extends Shape
{
    double l, b;

    Rectangle(double l, double b)
    {
        this.l = l;
        this.b = b;
    }

    void calculateArea()
    {
        System.out.println("Rectangle Area: " + (l * b));
    }

    void calculatePerimeter()
    {
        System.out.println("Rectangle Perimeter: " + (2 * (l + b)));
    }
}

class Triangle extends Shape
{
    double base, height, s1, s2, s3;

    Triangle(double base, double height, double s1, double s2, double s3)
    {
        this.base = base;
        this.height = height;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    void calculateArea()
    {
        System.out.println("Triangle Area: " + (0.5 * base * height));
    }

    void calculatePerimeter()
    {
        System.out.println("Triangle Perimeter: " + (s1 + s2 + s3));
    }
}

class Main
{
    public static void main(String args[]) throws Exception
    {
        Shape s[] = new Shape[3];

        s[0] = new Circle(5);
        s[1] = new Rectangle(10, 5);
        s[2] = new Triangle(6, 4, 5, 5, 6);

        System.out.println("Circle:");
        s[0].calculateArea();
        s[0].calculatePerimeter();

        System.out.println("\nRectangle:");
        s[1].calculateArea();
        s[1].calculatePerimeter();

        System.out.println("\nTriangle:");
        s[2].calculateArea();
        s[2].calculatePerimeter();
    }
}
