package cz.osu;

public class Match {
    private int lineNumber;
    private String matchUrl;
    private int matchID;
    private Team teamA;
    private Team teamB;
    private int scoreTeamA;
    private int scoreTeamB;
    private String competition;
    private MapType typeOfMatch;


    public Match(int lineNumber, String matchUrl, int matchID, Team teamA, Team teamB, int scoreTeamA, int scoreTeamB, String competition, MapType typeOfMatch) {
        this.lineNumber = lineNumber;
        this.matchUrl = matchUrl;
        this.matchID = matchID;
        this.scoreTeamA = scoreTeamA;
        this.scoreTeamB = scoreTeamB;
        this.competition = competition;
        this.typeOfMatch = typeOfMatch;
        this.teamA = teamA;
        this.teamB = teamB;
    }

    @Override
    public String toString() {
        return String.format("Match ID: %d, team A: %s, team B: %s, team A score: %d, team B score: %d, map of game: %s",
                matchID, teamA, teamB, scoreTeamA, scoreTeamB, typeOfMatch);
    }
}
