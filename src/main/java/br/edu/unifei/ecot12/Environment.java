package br.edu.unifei.ecot12;

import java.util.ArrayList;
import java.util.List;

public class Environment {
    private double salinity;
    private double waterPressure;
    private EnvironmentType type; 
    private double currentSpeed;

    private List<AdultFish> adultFishes;
    private List<LarvalFish> larvalFishes;

    public Environment(EnvironmentType type, double salinity, double waterPressure, double currentSpeed) {
        this.type = type;
        this.salinity = salinity;
        this.waterPressure = waterPressure;
        this.currentSpeed = currentSpeed;
        
        this.adultFishes = new ArrayList<>();
        this.larvalFishes = new ArrayList<>();
    }

    public void accept(FishVisitor visitor) {
        for (AdultFish fish : adultFishes) {
            fish.accept(visitor);
        }
    }
    
    public void addAdultFish(AdultFish fish) {
        this.adultFishes.add(fish);
    }

    public void removeAdultFish(AdultFish fish) {
        this.adultFishes.remove(fish);
    }

    public List<AdultFish> getAdultFishes() {
        return adultFishes;
    }

    public void addLarvalFish(LarvalFish fish) {
        this.larvalFishes.add(fish);
    }

    public void removeLarvalFish(LarvalFish fish) {
        this.larvalFishes.remove(fish);
    }

    public List<LarvalFish> getLarvalFishes() {
        return larvalFishes;
    }

    public double getSalinity() {
        return salinity;
    }

    public void setSalinity(double salinity) {
        this.salinity = salinity;
    }

    public double getWaterPressure() {
        return waterPressure;
    }

    public void setWaterPressure(double waterPressure) {
        this.waterPressure = waterPressure;
    }

    public EnvironmentType getType() {
        return type;
    }

    public void setType(EnvironmentType type) {
        this.type = type;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
}