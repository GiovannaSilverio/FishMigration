package br.edu.unifei.ecot12;

public class Environment {
    private double salinity;
    private double waterPressure;
    private EnvironmentType type; 
    private double currentSpeed;

    //constructor
    public Environment(EnvironmentType type, double salinity, double waterPressure, double currentSpeed) {
        this.type = type;
        this.salinity = salinity;
        this.waterPressure = waterPressure;
        this.currentSpeed = currentSpeed;
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
