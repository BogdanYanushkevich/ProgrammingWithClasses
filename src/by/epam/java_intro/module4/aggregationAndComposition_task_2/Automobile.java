package by.epam.java_intro.module4.aggregationAndComposition_task_2;

import java.util.ArrayList;
import java.util.List;

public class Automobile {

    private final String Model;
    private String colour;
    private Engine carEngine;

    private List<Wheel> carWheels;

    {
        carWheels = new ArrayList<>();
    }

    public Automobile(String model, String colour, Engine carEngine) {
        this.Model = model;
        this.colour = colour;
        this.carEngine = carEngine;
    }

    public List<Wheel> getCarWheels() {
        return carWheels;
    }

    public void addWheel(Wheel wheel){
        carWheels.add(wheel);
    }

    public void getModel() {
        System.out.println(Model);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Engine getCarEngine() {
        return carEngine;
    }

    public void setCarEngine(Engine carEngine) {
        this.carEngine = carEngine;
    }

    public void drive() {
        System.out.println("Car rides.");

    }

    public void fuel() {
        System.out.println("The car is refueling.");
    }

    public void changeWheel(int wheelToChanged, int replacementWheel) {

        Wheel temp = carWheels.get(wheelToChanged);
        carWheels.set(wheelToChanged, carWheels.get(replacementWheel));
        carWheels.set(replacementWheel, temp);


       /* Wheel temp = wheelToChanged;
        wheelToChanged = replacementWheel;
        replacementWheel = temp;*/
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "Model='" + Model + '\'' +
                ", colour='" + colour + '\'' +
                ", carEngine=" + carEngine +
                ", carWheels=" + carWheels +
                '}';
    }
}
