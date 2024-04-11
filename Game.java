public class Game {
    private Team team1;
    private Team team2;
    private String time;
    private String date;
    private String location;

    // Existing constructor
    public Game(Team t1, Team t2, String time) {
        team1 = t1;
        team2 = t2;
        this.time = time;
        date = "";
        location = "";
    }

    // Additional constructor with game location and date
    public Game(Team t1, Team t2, String time, String date, String location) {
        team1 = t1;
        team2 = t2;
        this.time = time;
        this.date = date;
        this.location = location;
    }

    // Getter and setter methods for team1
    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    // Getter and setter methods for team2
    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    // Getter and setter methods for time
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    // Getter and setter methods for date
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    // Getter and setter methods for location
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
