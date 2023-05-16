package seminar1.geroy;

import java.util.ArrayList;
import java.util.Random;

public abstract class Magic extends Basegeroy {
    protected int mana;
    protected int maxMana;

    Magic(int initiative, ArrayList<Basegeroy> team, String name, String entity, int level, int health, int maxHp,
            int[] damage, int speed, int weapon, int mana, int maxMana) {
        super(initiative,team, name, entity, level, health, maxHp, damage, speed, weapon);
        this.mana = mana;
        this.maxMana = mana;
    }

    void health() {

    }

    @Override
    public void step() {
        int Hp = new Random().nextInt(this.damage[0], this.damage[1] + 1);
        if (mana < 1 || maxHp == 0) {
            System.out.println("Лечение невозможно!");
            return;
        }
        int max_damaged = 0;
        float min = team.get(0).health / team.get(0).maxHp;
        for (int i = 0; i < team.size(); i++) {
            if (team.get(i).health / team.get(i).maxHp < min && team.get(i).health != 0) {
                min = team.get(i).health / team.get(i).maxHp;
                max_damaged = i;
            }
        }

        team.get(max_damaged).healed(Hp);
        this.mana -= Hp;

    }
}

// for (Basegeroy hero : team) {
// if (hero.health < hero.maxHp) {
// hero.getDamage(-damage);
// this.mana--;
// return;
