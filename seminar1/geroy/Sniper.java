package seminar1.geroy;
/*
 * Снайпер
 */

import java.util.ArrayList;

public class Sniper extends Shooter {
    public Sniper(ArrayList<Basegeroy> team, String name) {
        super(10,team, name, "Снайпер", 9, 88, 100, new int[] { 5, 5 }, 5, 10, 15, 5, 15, 0.9f);
    }

    @Override
    public String toString() {
        return "Снайпер";
    }

    public String getInfo() {
        return entity + "-" + name + "," + " уровень:" + level + "; здоровье:" + health +  "; скорость:" + speed
                + "; оружие:" + weapon + "; дистанция:" + distance +
                "; максимальный выстрел:" + maxshot + "; кол-во выстрелов:" + numberShotsFired + "; точность:"
                + accuracy + "; инициатива: " + initiative;
    }

    @Override
    public void step() {

    }

}
