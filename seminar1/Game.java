package seminar1;

import java.util.ArrayList;
import java.util.Random;

import seminar1.geroy.Basegeroy;
import seminar1.geroy.Crossbowman;
import seminar1.geroy.Magician;
import seminar1.geroy.Monk;
import seminar1.geroy.Outlaw;
import seminar1.geroy.Peasant;
import seminar1.geroy.Sniper;
import seminar1.geroy.Spearman;
import seminar1.geroy.Names;

public class Game {

    public static void main(String[] args) {
        

        ArrayList<Basegeroy> team1 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            switch (new Random().nextInt(5)) {
                case 0:

                    team1.add(new Crossbowman(team1, getName()));
                    break;
                case 1:
                    team1.add(new Peasant(team1, getName()));
                    break;
                case 2:
                    team1.add(new Monk(team1, getName()));
                    break;
                case 3:
                    team1.add(new Outlaw(team1, getName()));
                    break;
                case 4:
                    team1.add(new Sniper(team1, getName()));
                    break;

            }
        }
        ArrayList<Basegeroy> team2 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            switch (new Random().nextInt(5)) {
                case 0:
                    team2.add(new Spearman(team2, getName()));
                    break;
                case 1:
                    team2.add(new Peasant(team2, getName()));
                    break;
                case 2:
                    team2.add(new Magician(team2, getName()));
                    break;
                case 3:
                    team2.add(new Outlaw(team2, getName()));
                    break;
                case 4:
                    team1.add(new Crossbowman(team2, getName()));
                    break;

            }

        }
        System.out.println("Команда1: ");
        team1.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("Команда2: ");
        team2.forEach(n -> System.out.println(n.getInfo()));
        // team1.forEach(n -> n.getDamage(5));
        // team1.forEach(n->n.step());
        // team1.forEach(n -> System.out.println(n.getInfo()));
        team2.sort(Basegeroy::compareTo);
        System.out.println(team2);

    }

    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }

}