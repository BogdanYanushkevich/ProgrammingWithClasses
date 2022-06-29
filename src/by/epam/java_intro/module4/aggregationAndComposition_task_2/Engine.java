package by.epam.java_intro.module4.aggregationAndComposition_task_2;

public class Engine {

    private final String EngineModel;
    private final int EnginePower;

    public Engine(String engineModel,  int enginePower){
        this.EngineModel = engineModel;
        this.EnginePower = enginePower;

        if (enginePower < 50){
            System.out.println("This is not a car");
        }
    }

    public String getEngineModel() {
        return EngineModel;
    }

    public int getEnginePower() {
        return EnginePower;
    }

    public void startTheEngine(){
        System.out.println("Engine started.");
    }

    @Override
    public String toString() {
        return "Engine{" +
                "EngineModel='" + EngineModel + '\'' +
                ", EnginePower=" + EnginePower +
                '}';
    }
}
