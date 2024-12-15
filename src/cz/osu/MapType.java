package cz.osu;

public class MapType {

    private String mapName;
    private int matchesCount ;


    public MapType(String mapName) {
        this.mapName = mapName;
    }

    public String getMapName() {
        return mapName;
    }

    public void setMatchesCount() {
        matchesCount = matchesCount + 1;
    }

    public int getMatchesCount() {
        return matchesCount;
    }

    @Override
    public String toString() {
        return String.format("Map: %s, total number of games: %d ", mapName, matchesCount);
    }
}
