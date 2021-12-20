package nl.novi.javaprogrammeren.overerving;

public class Dog<eat> extends HouseAnimal{
    String favoriteFoodBrand;

    public Dog(String name, Gender gender, String species, String ownersName, String favoriteFoodBrand) {
        super(name, gender, species, ownersName);
        this.favoriteFoodBrand = favoriteFoodBrand;
    }

    public String getFavoriteFoodBrand() {
        return favoriteFoodBrand;
    }

    public void setFavoriteFoodBrand(String favoriteFoodBrand) {
        this.favoriteFoodBrand = favoriteFoodBrand;
    }


    //@Override is not good if I'm overriding a 2 level method? (def in Animal, skipped HouseAnimal
    public void eat(String food) {
        super.eat(this.favoriteFoodBrand);
    }

    @Override
    public void animalSound() {
        System.out.println("BARK BARK");
    }

    @Override
    public String toString() {
        return this.name + "is a " + this.gender + " dog that belongs to the " + this.species + ". Its owner is "
                + this.ownersName + ". Its prefers eating " + this.favoriteFoodBrand;
    }

}
