package nl.novi.javaprogrammeren.overerving;

public class Wolf extends ZooAnimal {

    private String packName;

    public String getPackName() {
        return packName;
    }

    public void setPackName(String packName) {
        this.packName = packName;
    }

    @Override
    public void sound() {
        System.out.println("Wolf-sound");
    }
}
