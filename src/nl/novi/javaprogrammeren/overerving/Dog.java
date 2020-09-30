package nl.novi.javaprogrammeren.overerving;

import java.time.DayOfWeek;

public class Dog extends Animal{

    private String nameOwner;
    private String foodBrand;
    private String race;

    public Dog(String name, String gender, String nameOwner, String foodBrand, String race) {
        super(name, gender);
        this.nameOwner = nameOwner;
        this.foodBrand = foodBrand;
        this.race = race;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public String getFoodBrand() {
        return foodBrand;
    }

    public void setFoodBrand(String foodBrand) {
        this.foodBrand = foodBrand;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public void makeSound() {
        System.out.println("WOOF!");
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\n\r").append("Name owner: ").append(getNameOwner())
            .append("\n\r").append("Favorite food brand: ").append(getFoodBrand())
            .append("\n\r").append("Race: ").append(getRace());
        return sb.toString();
    }

    @Override
    public void move() {
        System.out.println("moves 0.50 m");
    }

}
