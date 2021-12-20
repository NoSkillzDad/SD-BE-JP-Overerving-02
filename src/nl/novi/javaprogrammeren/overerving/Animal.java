package nl.novi.javaprogrammeren.overerving;

public abstract class Animal {
    String name;
    Gender gender;

    public enum Gender {
        MALE("M", "Male"), FEMALE("F", "Female");
        private String code;
        private String text;

        private Gender(String code, String text) {
            this.code = code;
            this.text = text;
        }

        public static Gender getGenderByCode(String code) {
            for (Gender gender : Gender.values()) {
                if (gender.code.equals(code)) {
                    return gender;
                }
            }
            return null;
        }

    }

    //Constructor

    public Animal(String name, Gender gender) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

// Methods

    public void move() {git
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
