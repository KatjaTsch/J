package Units;
public class Spearman extends Player{
    
    public Spearman(String name){
        super(name, 30, 0,6, 2, 10);
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
        return name + " здоровье: " + hp + " везение: " + luck + " скорость: " + speed 
    + " ущерб: " + damage;
    }

}
