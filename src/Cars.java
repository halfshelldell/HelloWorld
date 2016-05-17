/**
 * Created by illladell on 5/16/16.
 */
public class Cars {
    String name;
    String model;
    int year;
    String color;
    boolean isNew;

    public Cars(String name, String model, int year, String color, boolean isNew) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.color = color;
        this.isNew = isNew;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if (isValidName(newName)){
            //this.name = name;
            name = newName;
        }

    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int newYear) {
        year = newYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(boolean newIsNew) {
        isNew = newIsNew;
    }

    public static boolean isValidName(String newName) {
        return newName.contains(" ");
    }

}

