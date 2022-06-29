package by.epam.java_intro.module4.aggregationAndComposition_task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class State {

    private final String name;

    private final List<Region> regions;

    {
        regions = new ArrayList<>();
    }

    public State(String name, Region [] regions) {
        this.name = name;
        this.regions.addAll(Arrays.asList(regions));
    }

    public void addRegion(Region region) {
        regions.add(region);
    }

    public List<Region> getRegions() {
        return this.regions;
    }

    public String getName() {
        return name;
    }

    public void viewCapital() {
        City capital;
        for (Region reg : regions) {
            for (District distr : reg.getDistricts()) {
                if (distr.getDistrictCenter().isCapital()) {
                    capital = distr.getDistrictCenter();
                    System.out.println("The Capital of " + this.name + " is : " + capital.getName() );
                }
            }
        }
    }

    public void viewNumOfDistricts(){
        System.out.println("In " + name + "Number of regions : " +regions.size());
    }


    public void viewStateSquare (){
        double square = 0;
        for (Region reg : regions) {
            for (District distr : reg.getDistricts()) {
                 square += distr.getArea();
            }
        }
        System.out.println(name + " square : " +square);
    }

    public void viewRegionsCenter(){
        for (Region reg : regions) {
            System.out.println(reg.getNameRegionCenter());
        }
    }

    @Override
    public String toString() {
        return  "name : " + name + "\n" +
                "regions : " + regions;
    }
}

