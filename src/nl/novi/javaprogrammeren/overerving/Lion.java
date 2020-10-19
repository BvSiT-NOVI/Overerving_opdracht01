package nl.novi.javaprogrammeren.overerving;

public class Lion extends Animal {
    private int amountOfKids;

    public int getAmountOfKids() {
        return amountOfKids;
    }

    public void setAmountOfKids(int amountOfKids) {
        this.amountOfKids = amountOfKids;
    }

    @Override
    public void sound() {
        System.out.println("Simba");
    }
}
