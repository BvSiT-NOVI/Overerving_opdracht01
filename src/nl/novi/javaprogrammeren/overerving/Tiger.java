package nl.novi.javaprogrammeren.overerving;

import java.time.DayOfWeek;

public class Tiger extends Animal{

    private String origin;
    private String nameCage;
    private DayOfWeek dayOfWeekLastFed;
    private int numStripes;

    public Tiger(String name, String gender, String origin, String nameCage) {
        super(name, gender);
        this.origin = origin;
        this.nameCage = nameCage;
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

    public int getNumStripes() {
        return numStripes;
    }

    public void setNumStripes(int numStripes) {
        this.numStripes = numStripes;
    }

    @Override
    public void makeSound() {
        System.out.println("ROAR!");
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\n\r").append("Origin: ").append(getOrigin())
            .append("\n\r").append("Name cage: ").append(getNameCage())
            .append("\n\r").append("Number of stripes: ").append(getNumStripes());
        return sb.toString();
    }

}
