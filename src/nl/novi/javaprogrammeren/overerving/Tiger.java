package nl.novi.javaprogrammeren.overerving;

public class Tiger extends ZooAnimal {
    int numberStripes;

    //Constructor
    public Tiger(String name, Gender gender, String countryOrigin, String lastFeeding, int numberStripes) {
        super(name, gender, countryOrigin, lastFeeding);
        this.numberStripes = numberStripes;
    }

    public int getNumberStripes() {
        return numberStripes;
    }

    @Override
    public void animalSound() {
        System.out.println("GROOOOW");
    }

    @Override
    public String toString() {
        return this.name + "is a " + this.gender + " tiger from " + this.countryOrigin + " and it has "
                + this.numberStripes + " stripes. The last feeding was on: " + this.lastFeeding;
    }
}
