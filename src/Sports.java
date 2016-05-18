/**
 * Created by illladell on 5/16/16.
 */
public class Sports {
    String sport;
    String teamName;
    String location;
    int championships;
    String favoriteTeam;

    public Sports(String sport, String teamName, String location, int championships, String favoriteTeam){
        this.sport = sport;
        this.teamName = teamName;
        this.location = location;
        this.championships = championships;
        this.favoriteTeam = favoriteTeam;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String newSport) {
        sport = newSport;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String newTeamName) {
        teamName = newTeamName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String newLocation) {
        location = newLocation;
    }

    public int getChampionships() {
        return championships;
    }

    public void setChampionships(int newChampionships) {
        if (isValidChampionships(newChampionships)) {
            championships = newChampionships;
        }
    }

    public static boolean isValidChampionships(int newChampionships) {
        return newChampionships >= 1;
    }

    public String getFavoriteTeam() {
        return favoriteTeam;
    }

    public void setFavoriteTeam(String newFavoriteTeam) {
        favoriteTeam = newFavoriteTeam;
    }
}















