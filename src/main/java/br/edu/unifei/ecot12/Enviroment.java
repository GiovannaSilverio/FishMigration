package br.edu.unifei.ecot12;

public class Enviroment {
    private double salinity;
    private double waterPressure;
    private String type; 
    private double currentSpeed;
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
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getCurrentSpeed() {
        return currentSpeed;
    }
    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }


    
}
