package br.edu.unifei.ecot12;

public class CatadromousMigration implements MigrationBehavior {

    @Override
    public void migrate(AdultFish fish, Environment env) {
        if (fish instanceof AdultEel) {
            AdultEel enguia = (AdultEel) fish;

            if (enguia.isDigestiveTractFunctional()) {
                System.out.println("A enguia ainda é amarela. Fica no rio comendo.");
                return;
            }

            if (enguia.getLipidReserve() < 20.0) {
                System.out.println("Enguia muito magra. Morrerá no caminho.");
                return;
            }

            if (env.getType() == EnvironmentType.RIVER) {
                System.out.println("Enguia usando a correnteza para chegar ao Estuário...");

                Environment estuario = World.ESTUARIO;

                env.removeAdultFish(enguia);
                enguia.setCurrentLocation(estuario);
                estuario.addAdultFish(enguia);

            } else if (env.getType() == EnvironmentType.ESTUARY) {
                System.out.println("Saindo do estuário e entrando no mar aberto...");

                Environment oceano = World.OCEANO;

                env.removeAdultFish(enguia);
                enguia.setCurrentLocation(oceano);
                oceano.addAdultFish(enguia);

            } else if (env.getType() == EnvironmentType.OCEAN) {
                System.out.println("Enguia mergulhando para as profundezas para desovar.");

                Environment deepSea = World.DEEP_SEA;

                env.removeAdultFish(enguia);
                enguia.setCurrentLocation(deepSea);
                deepSea.addAdultFish(enguia);
            }
        }
    }
}