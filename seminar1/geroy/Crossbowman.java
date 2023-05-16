package seminar1.geroy;
/*
 * Арбалетчик
 */

import java.util.ArrayList;

public class Crossbowman extends Shooter  {
    public Crossbowman(ArrayList<Basegeroy> team,String name) {
        super(9,team, name,"Арбалетчик", 10, 90,100, new int[] { 3, 3 },2, 5, 5, 10, 10, 0.5f);
    }

    @Override
    public String toString() {
        return "Арбалетчик";
    }

    public String getInfo() {
        return entity +"-"+ name + "," + " уровень:" + level + "; здоровье:" + health + "; скорость:" + speed
                + "; оружие:" + weapon + "; дистанция:" + distance +
                "; максимальный выстрел:" + maxshot + "; кол-во выстрелов:" + numberShotsFired + "; точность:"
                + accuracy + "; инициатива: " + initiative;
    }

    @Override
    public void step() {

    }

}
