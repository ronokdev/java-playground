package javaoop.object.comparison;

import java.awt.Point;

public class Main
{
    public static void main(String[] args)
    {
        Point point1 = new Point(1,2);
        Point point2 = new Point(1,2);

        System.out.println(point1.equals(point2));

        System.out.println(point1 == point2);
    }
}
