package br.edu.unifei.ecot12;

public class AnadromyFactory implements MigratoryFishFactory {

    @Override
    public AdultFish newAdultFish() {
        return new AdultSalmon();

    }

    @Override
    public LarvalFish newLarvalFish() {
        return new LarvalSalmon();

    }

}
