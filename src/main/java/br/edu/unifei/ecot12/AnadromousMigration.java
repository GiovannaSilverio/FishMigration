package br.edu.unifei.ecot12;

public class AnadromousMigration implements MigrationBehavior {

    @Override
    public void migrate(AdultFish fish, Environment env) {
        if (fish instanceof AdultSalmon) {
            AdultSalmon salmon = (AdultSalmon) fish;

            if (env.getType() == EnvironmentType.OCEAN) {
                System.out.println("Salmao sentindo o cheiro de agua doce. Indo para o estuario");

                Environment estuario = World.ESTUARIO;

                env.removeAdultFish(salmon);
                salmon.setCurrentLocation(estuario);
                estuario.addAdultFish(salmon);

            } else if (env.getType() == EnvironmentType.ESTUARY) {
                System.out.println("Salmao adaptado. Entrando no rio.");

                Environment rio = World.RIO;

                env.removeAdultFish(salmon);
                salmon.setCurrentLocation(rio);
                rio.addAdultFish(salmon);

            } else if (env.getType() == EnvironmentType.RIVER) {
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