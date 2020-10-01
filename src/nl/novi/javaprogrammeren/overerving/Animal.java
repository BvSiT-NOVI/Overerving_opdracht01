package nl.novi.javaprogrammeren.overerving;

abstract public class Animal {
    private String name;  //name given to an animal (not species name)
    private String gender;

    public Animal(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void move(){
        System.out.println("moves 0.25 m");
    }

    abstract public void makeSound();

    public void sleep(){
        System.out.println("sleeps 8 hours a day");
    }

    //TODO How to test this method?
    public void eat(String nameFood){
        System.out.println("eats " + nameFood);
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append("has name ").append(this.getName())
            .append(" and gender is ").append(getGender());
        return sb.toString();
    }
}
