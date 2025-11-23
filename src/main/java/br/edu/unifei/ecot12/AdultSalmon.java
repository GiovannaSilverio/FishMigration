package br.edu.unifei.ecot12;

public class AdultSalmon extends AdultFish {
    private double jumpAbility;
    private double spawningColorIntensity;

    protected AdultSalmon(){}

    //getters e setters
    public double getJumpAbility() {
        return jumpAbility;
    }

    public void setJumpAbility(double jumpAbility) {
        this.jumpAbility = jumpAbility;
    }

    public double getSpawningColorIntensity() {
        return spawningColorIntensity;
    }

    public void setSpawningColorIntensity(double spawningColorIntensity) {
        this.spawningColorIntensity = spawningColorIntensity;
    }

    
}
