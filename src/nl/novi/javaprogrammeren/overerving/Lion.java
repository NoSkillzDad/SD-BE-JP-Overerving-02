package nl.novi.javaprogrammeren.overerving;

public class Lion extends ZooAnimal{
    int numberChildren;

    //Constructor
    public Lion(String name, Gender gender, String countryOrigin, String lastFeeding, int numberChildren) {
        super(name, gender, countryOrigin, lastFeeding);
        this.numberChildren = numberChildren;
    }

    public int getNumberChildren() {
        return numberChildren;
    }

    public void setNumberChildren(int numberChildren) {
        this.numberChildren = numberChildren;
    }
    @Override
    public void animalSound() {
        System.out.println("ROOOAAAAR");
    }

    @Override
    public String toString() {
        return this.name + "is a " + this.gender + " lion from " + this.countryOrigin + " and it has "
                + this.numberChildren + ". The last feeding was on: " + this.lastFeeding;
    }
}
