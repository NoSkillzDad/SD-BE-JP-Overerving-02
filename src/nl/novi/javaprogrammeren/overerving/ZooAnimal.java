package nl.novi.javaprogrammeren.overerving;

public abstract class ZooAnimal extends Animal  {
    String countryOrigin;
    String lastFeeding;

    //Constructor
    public ZooAnimal (String name, Gender gender, String countryOrigin, String lastFeeding) {
        super(name, gender);
        this.countryOrigin = countryOrigin;
        this.lastFeeding = lastFeeding;
    }

    //Getters
    public String getCountryOrigin() {
        return countryOrigin;
    }

    public String getLastFeeding() {
        return lastFeeding;
    }

    //Setters
    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    public void setLastFeeding(String lastFeeding) {
        this.lastFeeding = lastFeeding;
    }
}
