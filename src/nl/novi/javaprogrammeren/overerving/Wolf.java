package nl.novi.javaprogrammeren.overerving;

public class Wolf extends ZooAnimal {
    String namePack;

    //Constructor
    public Wolf(String name, Gender gender, String countryOrigin, String lastFeeding, String namePack) {
        super(name, gender, countryOrigin, lastFeeding);
        this.namePack = namePack;
    }

    public String getNamePack() {
        return namePack;
    }

    public void setNamePack(String namePack) {
        this.namePack = namePack;
    }

    @Override
    public void animalSound() {
        System.out.println("HOOOOOWL");
    }

    @Override
    public String toString() {
        return this.name + "is a " + this.gender + " wolf from " + this.countryOrigin + " and belongs to the "
                + this.namePack + " pack. The last feeding was on: " + this.lastFeeding;
    }
}








