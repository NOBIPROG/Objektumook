package Biologus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Animal {
    private String species;
    private String type;
    private double avgWeight;
    private double maxSpeed;
    private double avgAge;
    private List<String>continents;

    public Animal(String species, String type, double avgWeight, double maxSpeed, double avgAge) {
        this.species = species;
        this.type = type;
        this.avgWeight = avgWeight;
        this.maxSpeed = maxSpeed;
        this.avgAge = avgAge;
        this.continents = new ArrayList<>();
    }

    public void setContinents(String[] continents) {
        this.continents.addAll(Arrays.asList(continents));

    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public List<String> getContinents() {

        return continents;
    }

    public String getSpecies() {
        return species;
    }

    public String getType() {
        return type;
    }

    public double getAvgWeight() {
        return avgWeight;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getAvgAge() {
        return avgAge;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAvgWeight(double avgWeight) {
        this.avgWeight = avgWeight;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setAvgAge(double avgAge) {
        this.avgAge = avgAge;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", type='" + type + '\'' +
                ", avgWeight=" + avgWeight +
                ", maxSpeed=" + maxSpeed +
                ", avgAge=" + avgAge +
                ", continents=" + continents +
                '}';
    }
}
