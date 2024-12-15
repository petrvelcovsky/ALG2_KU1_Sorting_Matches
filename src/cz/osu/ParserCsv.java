package cz.osu;

import java.util.ArrayList;
import java.util.List;

public class ParserCsv {

    String path;
    ArrayList<Match> matches = new ArrayList<>();
    ArrayList<Team> teams = new ArrayList<>();
    ArrayList<MapType> mapTypes = new ArrayList<>();

    public ParserCsv(String path) {
        this.path = path;
    }

    public void matchesParser(){

        List<String> lines = FileManager.convertFileToLines(path);

        for (String line: lines.subList(1, lines.size())){

            String[] columns = line.split(";");

            int lineID = parseStringToInteger(columns[0]);
            String matchURL = columns[1];
            int matchID = parseStringToInteger(columns[2]);

            Team teamA = findOrCreateTeam(columns[3]);
            Team teamB = findOrCreateTeam(columns[4]);

            int scoreTeamA = parseStringToInteger(columns[5]);
            int scoreTeamB = parseStringToInteger(columns[6]);

            teamA.setEarnedPoints(scoreTeamA);
            teamB.setEarnedPoints(scoreTeamB);

            String competition = columns[7];

            MapType typeOfMatchMap = findOrCreateMap(columns[8]);
            typeOfMatchMap.setMatchesCount();

            Match match = new Match(lineID,matchURL,matchID,teamA,teamB,scoreTeamA,scoreTeamB,competition, typeOfMatchMap);
            matches.add(match);
        }
    }

    //Methods of converting individual items from String to its data type
    private Team findOrCreateTeam(String teamName) {
        for (Team team : teams) {
            if (team.getTeamName().equals(teamName)) {
                return team; // Team already exists, so I am returning it.
            }
        }
        Team newTeam = new Team(teamName); // Team doesn't exist, so new will be created.
        teams.add(newTeam);
        return newTeam;
    }

    private MapType findOrCreateMap(String typeOfMap){
        for (MapType mapType : mapTypes){
            if (mapType.getMapName().equals(typeOfMap)){
                return mapType;
            }
        }
        MapType newMapType = new MapType(typeOfMap);
        mapTypes.add(newMapType);
        return newMapType;
    }

    private int parseStringToInteger(String item){
        return Integer.parseInt(item);
    }

}




