package by.epam.java_intro.module4.aggregationAndComposition_task_2;

public class Wheel {

    private final String WheelPurpose;
    private final int WheelSize;

    public Wheel(String wheelPurpose, int wheelSize) {
        this.WheelPurpose = wheelPurpose;
        this.WheelSize = wheelSize;
    }

    public String getWheelPurpose() {
        return WheelPurpose;
    }

    public int getWheelSize() {
        return WheelSize;
    }

    @Override
    public String toString() {
        return "WheelPurpose : " + WheelPurpose +
                ", WheelSize = " + WheelSize + "|";
    }
}
