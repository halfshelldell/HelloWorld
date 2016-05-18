/**
 * Created by illladell on 5/16/16.
 */
public class Sneakers {
    String brand;
    String color;
    String model;
    boolean isPopular;
    double shoeSize;

    public Sneakers(String brand, String color, String model, boolean isPopular, double shoeSize) {
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.isPopular = isPopular;
        this.shoeSize = shoeSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String newBrand) {
        if (isValidBrand(newBrand)){
            brand = newBrand;
        }

    }

    public String getColor(){
        return color;
    }

    public void setColor(String newColor) {
         color = newColor;
     }

    public String getModel(){
        return model;
    }

    public void setModel(String newModel) {
        model = newModel;
    }

    public boolean getIsPopular() {
        return isPopular;
    }

    public void setIsAlive(boolean newIsPopular) {
        isPopular = newIsPopular;
    }

    public double getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize() {
        shoeSize += 1;
    }


    public static boolean isValidBrand(String newBrand) {
        return newBrand.contains("");
    }

}


