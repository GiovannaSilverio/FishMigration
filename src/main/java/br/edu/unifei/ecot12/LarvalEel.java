package br.edu.unifei.ecot12;

public class LarvalEel extends LarvalFish {
    private double transparenceLevel;
    private double sanilityStartTolerance;
    
    protected LarvalEel(){}

    public double getTransparenceLevel() {
        return transparenceLevel;
    }

    public void setTransparenceLevel(double transparenceLevel) {
        this.transparenceLevel = transparenceLevel;
    }

    public double getSanilityStartTolerance() {
        return sanilityStartTolerance;
    }

    public void setSanilityStartTolerance(double sanilityStartTolerance) {
        this.sanilityStartTolerance = sanilityStartTolerance;
    }


}
