package cz.osu;

import java.util.ArrayList;

public class Sorter {

    public static ArrayList<Team> quickSortTeams(ArrayList<Team> teams)
    {
        return quicksort(teams, 0, teams.size());
    }

    private static ArrayList<Team> quicksort(ArrayList<Team> teams, int left, int right)
    {
        if (left  < right) {
            int boundary = left;

            for (int i = left + 1   ; i < right; i++) {
                if (teams.get(i).getEarnedPoints() > teams.get(left).getEarnedPoints()) {
                    swap(teams, i, ++boundary);
                }
            }
            swap(teams, left, boundary);
            quicksort(teams, left, boundary);
            quicksort(teams, boundary + 1, right);
        }
        return teams;
    }

    private static void swap(ArrayList<Team> teams, int left, int right) {
        Team temp = teams.get(left);
        teams.set(left, teams.get(right));
        teams.set(right, temp);
    }

    public static ArrayList<MapType> insertSortMapType (ArrayList<MapType> maps)
    {
        for (int i = 1; i < maps.size(); i++)
        {
            MapType temp = maps.get(i);
            int j = i - 1;
            while (j >= 0 && temp.getMatchesCount() > maps.get(j).getMatchesCount())
            {
                maps.set(j+1, maps.get(j));
                j--;
            }
            maps.set(j+1, temp);
        }
        return maps;
    }

}
