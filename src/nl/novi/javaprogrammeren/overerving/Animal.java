package nl.novi.javaprogrammeren.overerving;

public abstract class Animal {
    String name;
    Gender gender;

    public enum Gender {
        MALE,
        FEMALE;
    }

    //Constructor

    public Animal(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

// Methods

    public void move() {
        System.out.println("0.25m");
    }

    public void sleep() {
        System.out.println("sleeping for 8 hrs");
    }

    public void eat(String food) {
        System.out.println("eating: " + food);
    }

    public abstract void animalSound();

}
