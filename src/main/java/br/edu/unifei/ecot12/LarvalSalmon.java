package br.edu.unifei.ecot12;

public class LarvalSalmon extends LarvalFish{
    private double freshWaterDependency;
    private double spotPatternVisibility;

    protected LarvalSalmon(){}

    public double getFreshWaterDependency() {
        return freshWaterDependency;
    }

    public void setFreshWaterDependency(double freshWaterDependency) {
        this.freshWaterDependency = freshWaterDependency;
    }

    public double getSpotPatternVisibility() {
        return spotPatternVisibility;
    }

    public void setSpotPatternVisibility(double spotPatternVisibility) {
        this.spotPatternVisibility = spotPatternVisibility;
    }

    

}