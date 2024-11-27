import java.util.*;

class polygon{
    abstract double area();
    void print();
    {
        System.out.println("Abstract Class");
    }
}

class Rect extends polygon{
    double side1 = 10.0, side2 = 20.5;
    double area();
    {
        double a = side1*side2;
        return a;
    }
}

class Demo_abstract{
    public static void main(String arg[]) {
        Rect r1 = new Rect();
        System.out.println("Area of Rectangle= "+r1.area());
        r1.print();
    }
}