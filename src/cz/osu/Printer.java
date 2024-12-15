package cz.osu;

import java.util.ArrayList;

public class Printer {

    public static void printMapTypes(ArrayList<MapType> mapTypes) {
        System.out.println("All used Map types:");
        int number = 1;
        for (MapType mapType : mapTypes) {
            System.out.print(number + ". ");
            System.out.println(mapType);
            number++;
        }
    }

    public static void print50Teams(ArrayList<Team> teams){
        System.out.println("50 teams:");
        for (int i = 0; i < 50; i++) {
            int number = i + 1;
            System.out.print(number + ". ");
            System.out.println(teams.get(i));
        }
    }

}
