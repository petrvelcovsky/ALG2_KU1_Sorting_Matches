package cz.osu;

public class Main {

    public static void main(String[] args) {

        ParserCsv parser = new ParserCsv("./HLTV_CSGO_results.csv");
        parser.matchesParser();

        System.out.println();
        System.out.println("---UNSORTED---");
        Printer.printMapTypes(parser.mapTypes);
        Printer.print50Teams(parser.teams);

        System.out.println();
        System.out.println("---SORTED---");
        Printer.printMapTypes(Sorter.insertSortMapType(parser.mapTypes));
        Printer.print50Teams(Sorter.quickSortTeams(parser.teams));

    }
}