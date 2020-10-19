package nl.novi.javaprogrammeren.overerving;

public class Tiger extends Animal {

    private int amountOfStripes;

    public int getAmountOfStripes() {
        return amountOfStripes;
    }

    public void setAmountOfStripes(int amountOfStripes) {
        this.amountOfStripes = amountOfStripes;
    }

    @Override
    public void sound() {
        System.out.println("Rawrrr");
    }
}
