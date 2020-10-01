package nl.novi.javaprogrammeren.overerving;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class Lion extends Animal{

    private String origin;
    private String nameCage;
    private DayOfWeek dayOfWeekLastFed;
    private int numChildren;

    public Lion(String name, String gender, String origin, String nameCage) {
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

    public int getNumChildren() {
        return numChildren;
    }

    public void setNumChildren(int numChildren) {
        this.numChildren = numChildren;
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
            .append("\n\r").append("Number of children: ").append(getNumChildren())
            .append("\n\r").append("Last fed on: ");
            if(getDayOfWeekLastFed()!=null){
                sb.append(getDayOfWeekLastFed().getDisplayName(TextStyle.FULL, Locale.ENGLISH));
            }
            else {
                sb.append(" not known");
            }
        return sb.toString();
    }

}
