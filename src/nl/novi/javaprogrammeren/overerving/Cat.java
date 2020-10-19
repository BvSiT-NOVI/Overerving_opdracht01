package nl.novi.javaprogrammeren.overerving;

public class Cat extends Pet {

    private boolean isHouseCat;

    public boolean isHouseCat() {
        return isHouseCat;
    }

    public void setHouseCat(boolean houseCat) {
        isHouseCat = houseCat;
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }
}
