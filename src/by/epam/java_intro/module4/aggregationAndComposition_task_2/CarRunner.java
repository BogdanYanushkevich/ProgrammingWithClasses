package by.epam.java_intro.module4.aggregationAndComposition_task_2;


public class CarRunner {

    public static void main(String [] args){


        Automobile automobile = new Automobile("MarioCart", "Red", new Engine("Turtle engine", 200));
        automobile.addWheel(new Wheel("left front", 21));
        automobile.addWheel(new Wheel("right front", 21));
        automobile.addWheel(new Wheel("left rear", 21));
        automobile.addWheel(new Wheel("right rear", 21));
        automobile.addWheel(new Wheel("spare wheel", 18));


        automobile.getCarEngine().startTheEngine();
        automobile.drive();
        automobile.fuel();
        System.out.println(automobile.getCarWheels());
        automobile.changeWheel(0, 4);
        System.out.println(automobile.getCarWheels());
        automobile.getModel();
    }
}
