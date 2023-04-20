package seminar1;

import seminar1.geroy.Crossbowman;
import seminar1.geroy.Magician;
import seminar1.geroy.Monk;
import seminar1.geroy.Outlaw;
import seminar1.geroy.Peasant;
import seminar1.geroy.Sniper;
import seminar1.geroy.Spearman;


public class Game {
    
    public static void main(String[] args) {
        Crossbowman crossbowman = new Crossbowman("Тревор");
        System.out.println(crossbowman.getInfo());
        Magician magician = new Magician("Томми");
        System.out.println(magician.getInfo());
        Monk monk = new Monk("Дюк");
        System.out.println(monk.getInfo());
        Outlaw outlaw = new Outlaw ("Олаф");
        System.out.println(outlaw.getInfo());
        Peasant peasant = new Peasant ("Римми");
        System.out.println(peasant.getInfo());
        Sniper sniper = new Sniper("Эдвард");
        System.out.println(sniper.getInfo());
        Spearman spearman = new Spearman("Ричард");
        System.out.println(spearman.getInfo());




      
        

       
        
        
    }
}
