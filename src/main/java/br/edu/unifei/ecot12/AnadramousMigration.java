package br.edu.unifei.ecot12;


public class AnadramousMigration implements MigrationBehavior {

    @Override
    public void migrate(AdultFish fish, Environment env) {
        if (fish instanceof AdultEel) {
            AdultEel enguia = (AdultEel) fish;

            if (enguia.isDigestiveTractFunctional() == true) {
                System.out.println("A enguia ainda é amarela. Fica no rio comendo.");
                return; 
            }

            if (enguia.getLipidReserve() < 20.0) { 
                System.out.println("Enguia muito magra. Morrerá no caminho.");
                return;
            }

            if (env.getType() == EnvironmentType.RIVER) {
                System.out.println("Enguia usando a correnteza para chegar ao Estuário...");
                
                Environment estuario = new Environment(EnvironmentType.ESTUARY, 15.0, 2.0, 5.0);
                enguia.setCurrentLocation(estuario);
            } 
            else if (env.getType() == EnvironmentType.ESTUARY) {
                System.out.println("Saindo do estuário e entrando no mar aberto...");
                
                Environment oceano = new Environment(EnvironmentType.OCEAN, 35.0, 10.0, 2.0);
                enguia.setCurrentLocation(oceano);
            }
            else if (env.getType() == EnvironmentType.OCEAN) {
                System.out.println("Enguia mergulhando para as profundezas para desovar.");
                
                Environment deepSea = new Environment(EnvironmentType.DEEP_SEA, 35.0, 1000.0, 0.0);
                enguia.setCurrentLocation(deepSea);
            }
        }
    }
}
    


