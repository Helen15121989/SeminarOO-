package seminar1.geroy;

import java.util.ArrayList;

/*
 * Крестьянин
 */
public class Peasant extends Basegeroy {
    public Peasant(ArrayList<Basegeroy> team,String name) {
        super(1,team, name, "Крестьянин", 2, 90,100,new int []{1,1}, 2, 5);

    }

    @Override
    public String toString() {
        return "Крестьянин";

    }

    public String getInfo() {
        return entity +"-"+ name + "," + " уровень:" + level + "; здоровье:" + health + "; скорость:"
                + speed + "; оружие:" + weapon + "; инициатива: " + initiative;
    }

    @Override
    public void step() {

    }

}
