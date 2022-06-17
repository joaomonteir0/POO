public class Movie {
    private String name, score, rating, gender, runningTime;

    public Movie(String name, String score, String rating, String gender, String runningTime){
        this.name = name;
        this.score = score;
        this.rating = rating;
        this.gender = gender;
        this.runningTime = runningTime;
    }

    public String getGender() {
        return gender;
    }
    public String getName() {
        return name;
    }
    public String getRating() {
        return rating;
    }
    public String getRunningTime() {
        return runningTime;
    }
    public String getScore() {
        return score;
    }
    
}
