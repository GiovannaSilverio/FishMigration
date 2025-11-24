package br.edu.unifei.ecot12;

public class AdultSalmon extends AdultFish {
    private double jumpAbility;
    private double spawningColorIntensity;

    protected AdultSalmon(){}

    @Override
    public void accept(FishVisitor visitor) {
        visitor.visit(this);
    }

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