package seminar1.geroy;
/*
 * Создание полей данных для персонажей
 */

import java.util.ArrayList;
//import java.util.Random;



public abstract class Basegeroy implements GameInterface, Comparable <Basegeroy> {

    protected String name;
    protected String entity;
    protected int level;
    protected int health, maxHp, speed, weapon;
    protected int[] damage;
    protected ArrayList<Basegeroy> team;
    protected int initiative;

    protected Basegeroy(int initiative, ArrayList<Basegeroy> team, String name, String entity, int level, int health,
            int maxHp,
            int[] damage, int speed, int weapon) {
        this.team = team;
        this.name = name;
        this.entity = entity;
        this.level = level;
        this.health = health;
        this.maxHp = health;
        // if (new Random().nextBoolean())this.health-=10;
        this.damage = damage;
        this.speed = speed;
        this.weapon = weapon;
        this.initiative = initiative;

    }

    public void getDamage(int attack) {
        this.health -= attack;
        if (this.health > this.maxHp) {
            this.health = this.maxHp;
        }
        if (this.health < 0) {
            this.health = 0;
        }
    }

    protected void healed(int Hp) {
        this.health = Hp + this.health > this.maxHp ? this.maxHp : Hp + this.health;
    }

    @Override
    public String getInfo() {
        return entity + "-" + name + "," + " уровень:" + level + "; здоровье:" + health + "; инициатива: " + initiative;

    }

   


    @Override
    public int compareTo(Basegeroy o) {
        
        return o.initiative - this.initiative;
    }

}
