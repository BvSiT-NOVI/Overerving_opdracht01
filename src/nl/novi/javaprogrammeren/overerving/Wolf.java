package nl.novi.javaprogrammeren.overerving;

import java.time.DayOfWeek;

public class Wolf extends Animal{

    private String origin;
    private String nameCage;
    private DayOfWeek dayOfWeekLastFed;
    private String namePack;

    public Wolf(String name, String gender, String origin, String nameCage) {
        super(name, gender);
        this.origin = origin;
        this.nameCage = nameCage;
    }

    public String getNamePack() {
        return namePack;
    }

    public void setNamePack(String namePack) {
        this.namePack = namePack;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getNameCage() {
        return nameCage;
    }

    public void setNameCage(String nameCage) {
        this.nameCage = nameCage;
    }

    public DayOfWeek getDayOfWeekLastFed() {
        return dayOfWeekLastFed;
    }

    public void setDayOfWeekLastFed(DayOfWeek dayOfWeekLastFed) {
        this.dayOfWeekLastFed = dayOfWeekLastFed;
    }

    @Override
    public void makeSound() {
        System.out.println("HOWL!");
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\n\r").append("Origin: ").append(getOrigin())
            .append("\n\r").append("Name cage: ").append(getNameCage())
            .append("\n\r").append("Name of pack: ").append(getNamePack());
        return sb.toString();
    }

}
