package br.edu.unifei.ecot12;

public abstract class LarvalFish {

    private int ageDays;
    private String developmentStage;
    private double sanilityTolerance;
    private Environment currentLocation;

    

    public int getAgeDays() {
        return ageDays;
    }
    public void setAgeDays(int ageDays) {
        this.ageDays = ageDays;
    }
    public String getDevelopmentStage() {
        return developmentStage;
    }
    public void setDevelopmentStage(String developmentStage) {
        this.developmentStage = developmentStage;
    }
    public double getSanilityTolerance() {
        return sanilityTolerance;
    }
    public void setSanilityTolerance(double sanilityTolerance) {
        this.sanilityTolerance = sanilityTolerance;
    }
    public Environment getCurrentLocation() {
        return currentLocation;
    }
    public void setCurrentLocation(Environment currentLocation) {
        this.currentLocation = currentLocation;
    }

    

}
