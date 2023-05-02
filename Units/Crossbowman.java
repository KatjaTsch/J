package Units;
public class Crossbowman extends Shooter{
    
    Crossbowman(String e){
        super(name, 20, 0,5, 2, 2, 2, 50);
    }

    @Override
    public String toString() {
        return name;
    }

   
}
