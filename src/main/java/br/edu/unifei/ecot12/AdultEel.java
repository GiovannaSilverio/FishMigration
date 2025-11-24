package br.edu.unifei.ecot12;

public class AdultEel extends AdultFish {
    private double lipidReserve;
    private boolean digestiveTractFunctional;

    protected AdultEel(){}

    @Override
    public void accept(FishVisitor visitor) {
        visitor.visit(this);
    }

    public double getLipidReserve() {
        return lipidReserve;
    }

    public void setLipidReserve(double lipidReserve) {
        this.lipidReserve = lipidReserve;
    }

    public boolean isDigestiveTractFunctional() {
        return digestiveTractFunctional;
    }

    public void setDigestiveTractFunctional(boolean digestiveTractFunctional) {
        this.digestiveTractFunctional = digestiveTractFunctional;
    }
}