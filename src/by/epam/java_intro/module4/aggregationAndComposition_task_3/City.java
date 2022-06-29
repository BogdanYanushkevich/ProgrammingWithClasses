package by.epam.java_intro.module4.aggregationAndComposition_task_3;

public class City {
    private String name;

    private double area;
    private long population;

    private boolean isRegionalCenter;
    private boolean isCapital;



    public City(String name, double area, long population, boolean isRegionalCenter, boolean isCapital) {
        this.name = name;
        this.population = population;
        this.area = area;
        this.isCapital = isCapital;
        this.isRegionalCenter = isRegionalCenter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    public boolean isRegionalCenter() {
        return isRegionalCenter;
    }

    public void setRegionalCenter(boolean regionalCenter) {
        isRegionalCenter = regionalCenter;
    }


    @Override
    public String toString() {
        return
                "Name = " + name +"\n" +
                "Population = " + population + "\n" +
                "Area = " + area + "\n" +
                "Is Capital ?  : " + isCapital + "\n"+
                "Is RegionalCenter ?  : " + isRegionalCenter;
    }
}
