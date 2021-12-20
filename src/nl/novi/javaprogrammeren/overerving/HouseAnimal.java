package nl.novi.javaprogrammeren.overerving;

import nl.novi.javaprogrammeren.AnimalMain;

public abstract class HouseAnimal extends Animal {
    String ownersName;
    String species;

    //Constructor

    public HouseAnimal(String name, Gender gender, String species, String ownersName) {
        super(name, gender);
        this.species = species;
        this.ownersName = ownersName;
    }

    //Getters
    public String getSpecies() {
        return species;
    }

    public String getOwnersName() {
        return ownersName;
    }

    //Setters
    public void setSpecies(String species) {
        this.species = species;
    }

    public void setOwnersName(String ownersName) {
        this.ownersName = ownersName;
    }
}
