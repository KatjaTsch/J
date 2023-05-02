package Units;
public class Monk extends Magican{
        
   Monk(String name) {
    super(name, 20, 0,6, 1, 2, 20);
    }

    void Heal(){

    }
    
    @Override
    public String toString() {
        return name;
    }
}
