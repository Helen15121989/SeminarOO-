package seminar1.geroy;
/*
 * Монах
 */

 public class Monk extends Magic {
    public Monk (String name){
        super(name, 9, 99, 10,3,2,35);

    }
    
    @Override
    public String toString() {
        return name;
    }
    public String getInfo() {
        return String.format("Монах: %s",
                this.name);
    }

}

    