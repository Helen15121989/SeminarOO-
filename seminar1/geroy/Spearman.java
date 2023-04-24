package seminar1.geroy;
/*
 * Копейщик
 */

public class Spearman extends Shooter  {
    public Spearman(String name) {
        super(name,"Копейщик", 15, 77, 3, 1, 2, 5, 2, 10, 0.3f);
    }

    @Override
    public String toString() {
        return "Копейщик";
    }

    public String getInfo() {
        return entity +"-"+  name + "," + " уровень:" + level + "; здоровье:" + health + "; урон:" + damage + "; скорость:" + speed
                + "; оружие:" + weapon + "; дистанция:" + distance +
                "; максимальный выстрел:" + maxshot + "; кол-во выстрелов:" + numberShotsFired + "; точность:"
                + accuracy;
    }

    @Override
    public void step() {

    }
}
