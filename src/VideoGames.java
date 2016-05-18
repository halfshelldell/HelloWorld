/**
 * Created by illladell on 5/16/16.
 */
public class VideoGames {
    String name;
    String console;
    double price;
    int hoursPlayed;
    String favoriteGame;

    public VideoGames(String name, String console, double price, int hoursPlayed, String favoriteGame){
        this.name = name;
        this.console = console;
        this.price = price;
        this.hoursPlayed = hoursPlayed;
        this.favoriteGame = favoriteGame;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String newConsole) {
        console = newConsole;
        //this.console = console;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    public double getHoursPlayed() {
        return hoursPlayed;
    }

    public void setHoursPlayed(int newHoursPlayed) {
        hoursPlayed = newHoursPlayed;
    }

    public String getFavoriteGame() {
        return favoriteGame;
    }

    public void setFavoriteGame(String newFavoriteGame) {
        if (isValidFavorite(newFavoriteGame)) {
            favoriteGame = newFavoriteGame;
        }
    }

    public static boolean isValidFavorite(String newFavoriteGame) {
        return newFavoriteGame.equalsIgnoreCase("Mario");
    }
}

