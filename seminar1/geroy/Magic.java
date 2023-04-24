package seminar1.geroy;

public abstract class Magic extends Basegeroy {
    protected int mana;

    Magic(String name, String entity, int level, int health, int damage, int speed, int weapon, int mana) {
        super(name, entity, level, health, damage, speed, weapon);
        this.mana = mana;
    }

    void health() {

    }
    void maximumMana (){
        
    }

}
