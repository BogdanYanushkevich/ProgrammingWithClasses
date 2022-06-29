package by.epam.java_intro.module4.aggregationAndComposition_task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Region {

    private String name;

    private String nameRegionCenter;

    private List<District> districts;

    {
        districts = new ArrayList<>();
    }

    public List<District>getDistricts(){

        return this.districts;
    }

    public Region(String name, String nameRegionCenter,  District...district){
        this.name = name;
        this.nameRegionCenter = nameRegionCenter;
        this.districts.addAll(Arrays.asList(district));
    }



    public void addDistrict(District district) {
        districts.add(district);
    }

    public String getName() {
        return name;
    }

    public String getNameRegionCenter() {
        return nameRegionCenter;
    }

    @Override
    public String toString() {
        return "Region{" +
                "name='" + name + '\'' +
                ", nameRegionCenter='" + nameRegionCenter + '\'' +
                ", districts=" + districts +
                '}';
    }
}
