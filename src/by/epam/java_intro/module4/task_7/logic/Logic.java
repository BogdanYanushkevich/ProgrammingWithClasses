package by.epam.java_intro.module4.task_7.logic;

import by.epam.java_intro.module4.task_7.entity.CustomeTriangle;
import by.epam.java_intro.module4.task_7.entity.Triangle;

public class Logic {

    public double findTrianglePerimeter(CustomeTriangle someTriangle) {

        double a = someTriangle.a();
        double b = someTriangle.b();
        double c = someTriangle.c();


        return Math.sqrt(a + b + c) / 2.0;
    }

    public double findTrianglSquare(CustomeTriangle someTriangle) {

        double a = someTriangle.a();
        double b = someTriangle.b();
        double c = someTriangle.c();

        double p = findTrianglePerimeter(someTriangle);

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }


    public double findSides(double x, double y, double secX, double secY) {


        return Math.sqrt((x - secX) * (x - secX) + (y - secY) * (y - secY));

    }


    public CustomeTriangle ctreateCustomeTriangle(Triangle someTriangle) {


        double a = findSides(someTriangle.getX1(), someTriangle.getY1(), someTriangle.getX2(), someTriangle.getY2());
        double b = findSides(someTriangle.getX1(), someTriangle.getY1(), someTriangle.getX3(), someTriangle.getY3());
        double c = findSides(someTriangle.getX2(), someTriangle.getY2(), someTriangle.getX3(), someTriangle.getY3());


        return new CustomeTriangle(a, b, c);
    }

    public String triangleMedianIntersections(Triangle someTriangle) {

        double x = (someTriangle.getX1() + someTriangle.getX2() + someTriangle.getX3()) / 3;
        double y = (someTriangle.getY1() + someTriangle.getY2() + someTriangle.getY3()) / 3;


        return "Points of intersection of medians : X :" + x + "\t Y : " + y;
    }
}


