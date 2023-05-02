package Units;

public class Sniper extends Shooter{
    
    Sniper(String name){
        super(name, 20, 0,6, 2, 4, 5, 10);
    }

    @Override
    public String toString() {
        return name;
    }
    
}
