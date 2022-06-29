package by.epam.java_intro.module4.task_7.main;
import by.epam.java_intro.module4.task_7.logic.Logic;
import by.epam.java_intro.module4.task_7.entity.CustomeTriangle;
import by.epam.java_intro.module4.task_7.entity.Triangle;
import by.epam.java_intro.module4.task_7.view.TriangleView;

/*7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
площади, периметра и точки пересечения медиан.*/



public class Main {

    public static void main(String[] args) {


        Triangle triangle = new Triangle(0, 8, 2, 0, 4, 0);
        Logic logic = new Logic();
        TriangleView view = new TriangleView();

        CustomeTriangle customeTriangle;
        String triangleMedianIntersections;

        double trianlePerimeter;
        double triangleSquare;


        customeTriangle = logic.ctreateCustomeTriangle(triangle);
        trianlePerimeter = logic.findTrianglePerimeter(customeTriangle);
        triangleSquare = logic.findTrianglSquare(customeTriangle);
        triangleMedianIntersections = logic.triangleMedianIntersections(triangle);


        view.print(triangle);
        view.print(customeTriangle);
        view.print(trianlePerimeter);
        view.print(triangleSquare);
        view.print(triangleMedianIntersections);

    }
}

