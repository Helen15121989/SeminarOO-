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

        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(5)) {
                case 0:

                    team1.add(new Crossbowman(getName()));
                    break;
                case 1:
                    team1.add(new Peasant(getName()));
                    break;
                case 2:
                    team1.add(new Monk(getName()));
                    break;
                case 3:
                    team1.add(new Outlaw(getName()));
                    break;
                case 4:
                    team1.add(new Sniper(getName()));
                    break;

            }
        }
        ArrayList<Basegeroy> team2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(5)) {
                case 0:
                    team2.add(new Spearman(getName()));
                    break;
                case 1:
                    team2.add(new Peasant(getName()));
                    break;
                case 2:
                    team2.add(new Magician(getName()));
                    break;
                case 3:
                    team2.add(new Outlaw(getName()));
                    break;
                case 4:
                    team1.add(new Crossbowman(getName()));
                    break;

            }

        }
        System.out.println("Команда1: ");
        team1.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("Команда2: ");
        team2.forEach(n -> System.out.println(n.getInfo()));

    }

    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }

    // Crossbowman crossbowman = new Crossbowman("Тревор");
    // System.out.println(crossbowman.getInfo());
    // Magician magician = new Magician("Томми");
    // System.out.println(magician.getInfo());
    // Monk monk = new Monk("Дюк");
    // System.out.println(monk.getInfo());
    // Outlaw outlaw = new Outlaw ("Олаф");
    // System.out.println(outlaw.getInfo());
    // Peasant peasant = new Peasant ("Римми");
    // System.out.println(peasant.getInfo());
    // Sniper sniper = new Sniper("Эдвард");
    // System.out.println(sniper.getInfo());
    // Spearman spearman = new Spearman("Ричард");
    // System.out.println(spearman.getInfo());

}