package br.edu.unifei.ecot12;

public class CatadromousMigration implements MigrationBehavior {

    @Override
    public void migrate(AdultFish fish, Environment env) {
        if (fish instanceof AdultSalmon) {
            AdultSalmon salmon = (AdultSalmon) fish;

            if (env.getType() == EnvironmentType.OCEAN) {
                System.out.println("Salmao sentindo o cheiro de agua doce. Indo para o estuario");
                
                Environment estuario = new Environment(EnvironmentType.ESTUARY, 15.0, 2.0, 1.0);
                fish.setCurrentLocation(estuario);
            } 
            else if (env.getType() == EnvironmentType.ESTUARY) {
                System.out.println("Salmao adaptado. Entrando no rio.");

                Environment rio = new Environment(EnvironmentType.RIVER, 0.0, 1.0, 15.0);
                fish.setCurrentLocation(rio);
            }
            else if (env.getType() == EnvironmentType.RIVER) {
                double currentForce = env.getCurrentSpeed();

                if (salmon.getJumpAbility() < currentForce) {
                    System.out.println("Salmao nao conseguiu subir a corredeira. Exausto.");
                } else {
                    System.out.println("Salmao saltou a cachoeira com sucesso");
                }
            }
        }
    }
}