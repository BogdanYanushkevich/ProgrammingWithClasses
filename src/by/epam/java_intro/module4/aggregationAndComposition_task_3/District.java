package by.epam.java_intro.module4.aggregationAndComposition_task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class District {

    private String name;

    private double area;

    private long population;

    private City districtCenter;

    private List<City> willages;


    {
        willages = new ArrayList<>();
    }


    public List<City>getWillages(){
        return willages;
    }

    public District(String name, double area, long population, City districtCenter) {
        this.name = name;
        this.area = area;
        this.population = population;
        this.districtCenter = districtCenter;

    }

    public void addWillage(City city) {
        willages.add(city);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public City getDistrictCenter() {
        return districtCenter;
    }

    public void setDistrictCenter(City districtCenter) {
        this.districtCenter = districtCenter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof District district)) return false;
        return Double.compare(district.getArea(), getArea()) == 0 && getPopulation() == district.getPopulation() && getName().equals(district.getName()) && getDistrictCenter().equals(district.getDistrictCenter()) && Objects.equals(getWillages(), district.getWillages());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getArea(), getPopulation(), getDistrictCenter(), getWillages());
    }

    @Override
    public String toString() {
        return "District : " + '\n'+
                "Name : " + name + '\n' +
                "Area : " + area +'\n'+
                "Population : " + population +'\n'+
                "DistrictCenter : " + districtCenter +'\n'+
                "Willages : " + willages;
    }
}
