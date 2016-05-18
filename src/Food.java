/**
 * Created by illladell on 5/16/16.
 */
public class Food {
    String name;
    String goToPlace;
    boolean favoriteFood;
    String category;
    boolean delicious;

    public Food(String name, String goToPlace, boolean favoriteFood, String category, boolean delicious){
        this.name = name;
        this.goToPlace = goToPlace;
        this.favoriteFood = favoriteFood;
        this.category = category;
        this.delicious = delicious;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getGoToPlace() {
        return goToPlace;
    }

    public void setGoToPlace(String newGoToPlace) {
        goToPlace = newGoToPlace;
    }

    public boolean getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(boolean newFavoriteFood) {
        if (isValidFavorite(newFavoriteFood)) {
            favoriteFood = newFavoriteFood;
        }
    }

    public static boolean isValidFavorite(boolean newFavoriteFood) {
        return newFavoriteFood ;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String newCategory) {
        category = newCategory;
    }

    public boolean getDelicious() {
        return delicious;
    }

    public void setDelicious(boolean newDelicious) {
        delicious = newDelicious;
    }

}
