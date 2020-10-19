package nl.novi.javaprogrammeren.overerving;

public abstract class Animal {

    private String name;
    public boolean isFemale;

    public void move() {
        System.out.println("Moved 0.25 meters.");
    }

    public abstract void sound();

    public void sleep() {
        System.out.println("Let's sleep for 8 hours");
    }

    public void eat(String food) {
        System.out.println("I eat " + food);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public void setFemale(boolean female) {
        isFemale = female;
    }
}
