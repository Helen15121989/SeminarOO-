package seminar1.geroy;

public abstract class Shooter extends Basegeroy {
    protected int distance, maxshot, numberShotsFired;
    protected float accuracy;

    Shooter(String name, String intity, int level, int health, int damage, int speed, int weapon, 
            int distance, int maxshot, int numberShotsFired, float accuracy ){
        super (name,intity, level, health, damage, speed,weapon);
        this.distance =  distance;
        this.maxshot = maxshot;
        this.numberShotsFired = numberShotsFired;
        this.accuracy = accuracy;
        

        }
        void shoot (){
    }
    
}
