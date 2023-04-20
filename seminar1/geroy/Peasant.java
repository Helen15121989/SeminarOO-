package seminar1.geroy;

/*
 * Крестьянин
 */
public class Peasant extends Basegeroy {
   public Peasant(String name) {
        super(name, 2, 100, 2, 5, 5);

 
    }

    @Override 
    public String toString() {
        return name;
        
    }
    public String getInfo() {
        return String.format("Крестьянин: %s",
                this.name);
    }

}
