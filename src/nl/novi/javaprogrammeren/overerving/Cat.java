package nl.novi.javaprogrammeren.overerving;

public class Cat extends HouseAnimal {
    boolean indoor;

    public Cat(String name, Gender gender, String species, String ownersName, boolean indoor) {
        super(name, gender, species, ownersName);
        this.indoor = indoor;
    }

    public boolean isIndoor() {
        return indoor;
    }

    public void setIndoor(boolean indoor) {
        this.indoor = indoor;
    }

    @Override
    public void animalSound() {
        System.out.println("MEEEEOOOOOW");
    }

    @Override
    public String toString() {
        String prefers = "";

        prefers = (this.indoor) ? "indoor" : "outdoor";

        return this.name + "is a " + this.gender + " cat that belongs to the " + this.species + ". Its owner is "
                + this.ownersName + ". This is an " + prefers + "cat.";
    }
}
