package seminar1.geroy;
/*
 * Копейщик
 */

import java.util.ArrayList;

public class Spearman extends Shooter {
    public Spearman(ArrayList<Basegeroy> team, String name) {
        super(7,team, name, "Копейщик", 15, 77, 100, new int[] { 2, 3 }, 3, 1, 5, 2, 10, 0.3f);
    }

    @Override
    public String toString() {
        return "Копейщик";
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
