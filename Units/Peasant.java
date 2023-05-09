package Units;
public class Peasant extends Player{
    public Peasant(String name) {
        super(name, 10, 0,1, 10, 5);
    }
    
    @Override
    public String toString() {
        return name;
    }

    @Override
    public void step() {
       
    }

    @Override
    public String getInfo() {
        return name;
    }

}