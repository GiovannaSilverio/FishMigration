package br.edu.unifei.ecot12;

public abstract class AdultFish {
    private int age;
    private int weight;
    private Environment currentLocation;
    private MigrationBehavior migrationBehavior;

    public void performMigration(){
        if (migrationBehavior!=null){
            migrationBehavior.migrate(this, currentLocation);
        }
        else{
            System.out.println("Este peixe nao tem instinto migratorio definido");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Environment getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Environment currentLocation) {
        this.currentLocation = currentLocation;
    }

    public MigrationBehavior getMigrationBehavior() {
        return migrationBehavior;
    }

    public void setMigrationBehavior(MigrationBehavior migrationBehavior) {
        this.migrationBehavior = migrationBehavior;
    }

    

}
