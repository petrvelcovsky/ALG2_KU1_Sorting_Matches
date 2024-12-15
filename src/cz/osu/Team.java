package cz.osu;

public class Team {
    private String teamName;
    private int earnedPoints = 0;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getEarnedPoints() {
        return earnedPoints;
    }

    public void setEarnedPoints(int earnedPoints) {
        this.earnedPoints += earnedPoints;
    }

    @Override
    public String toString() {
        return String.format("Team: %s, total points: %d", teamName, earnedPoints);
    }

}
