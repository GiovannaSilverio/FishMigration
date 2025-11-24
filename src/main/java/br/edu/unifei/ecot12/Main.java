package br.edu.unifei.ecot12;

public class Main {
    public static void main(String[] args) {

        // instanciando as fábricas
        MigratoryFishFactory factorySalmao = new AnadromyFactory();
        MigratoryFishFactory factoryEnguia = new CatadromyFactory();

        // criando os peixes
        System.out.println("--- CRIANDO OS PEIXES ---");

        AdultSalmon salmao1 = (AdultSalmon) factorySalmao.newAdultFish();
        AdultSalmon salmao2 = (AdultSalmon) factorySalmao.newAdultFish();
        AdultEel enguia1     = (AdultEel) factoryEnguia.newAdultFish();

        // configurando comportamentos de migração
        salmao1.setMigrationBehavior(new AnadromousMigration());
        salmao2.setMigrationBehavior(new AnadromousMigration());
        enguia1.setMigrationBehavior(new CatadromousMigration());

        // colocando peixes em seus ambientes iniciais
        moveFishTo(salmao1, World.OCEANO);
        moveFishTo(salmao2, World.OCEANO);
        moveFishTo(enguia1, World.RIO);

        // definindo atributos específicos
        salmao1.setJumpAbility(10.0);
        salmao2.setJumpAbility(20.0);

        enguia1.setLipidReserve(50.0);
        enguia1.setDigestiveTractFunctional(false);

        // censo antes da migração
        System.out.println("\n--- FAZENDO O CENSO (ANTES DE MIGRAR) ---");
        printCenso("Oceano", World.OCEANO);
        printCenso("Rio", World.RIO);

        // migração
        System.out.println("\n--- ACONTECENDO A MIGRAÇÃO ---");
        salmao1.performMigration();
        salmao2.performMigration();
        enguia1.performMigration();

        // censo após a migração
        System.out.println("\n--- FAZENDO O CENSO (NO ESTUÁRIO) ---");
        printCenso("Estuário", World.ESTUARIO);

        // censo final no oceano
        CensoVisitor oceanoFinal = new CensoVisitor();
        World.OCEANO.accept(oceanoFinal);
        System.out.println("\nSalmões restantes no Oceano: " + oceanoFinal.getCountSalmon());
    }

    // função para mover peixes entre ambientes
    private static void moveFishTo(AdultFish fish, Environment target) {
        Environment origin = fish.getCurrentLocation();
        if (origin != null) {
            origin.removeAdultFish(fish);
        }
        fish.setCurrentLocation(target);
        target.addAdultFish(fish);
    }

    // função para realizar censo em um ambiente
    private static void printCenso(String nome, Environment env) {
        CensoVisitor censo = new CensoVisitor();
        env.accept(censo);

        System.out.println("No " + nome + " tem:");
        System.out.println("-> Salmões: " + censo.getCountSalmon());
        System.out.println("-> Enguias: " + censo.getCountEel());
    }
}
