package seminar1.geroy;
/*
 * Арбалетчик
 */

public class Crossbowman extends Shooter  {
    public Crossbowman(String name) {
        super(name, 10, 90, 10, 2, 5, 5, 10, 10, 0.5f);
    }

    @Override
    public String toString() {
        return "Арбалетчик";
    }

    public String getInfo() {
        return name + "," + " уровень:" + level + "; здоровье:" + health + "; урон:" + damage + "; скорость:" + speed
                + "; оружие:" + weapon + "; дистанция:" + distance +
                "; максимальный выстрел:" + maxshot + "; кол-во выстрелов:" + numberShotsFired + "; точность:"
                + accuracy;
    }

    @Override
    public void step() {

    }

}
