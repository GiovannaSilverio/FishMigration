package br.edu.unifei.ecot12;

public class CatadromyFactory implements MigratoryFishFactory {

    @Override
    public AdultFish newAdultFish() {
        return new AdultEel();
    }

    @Override
    public LarvalFish newLarvalFish() {
        return new LarvalEel();
    }

}
