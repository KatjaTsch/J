package Units;

import java.util.ArrayList;

public class Spearman extends Player{
    
    public Spearman(ArrayList<Player> team, String name){
        super(team, name, 30, 21, 6, 2, new int[]{1,2});
    }
    @Override
    public String toString() {
        return name;
    }
   
    @Override
    public String getInfo() {
        return name + " здоровье: " + hp + " везение: " + luck + " скорость: " + speed 
    + " ущерб: " + damage;
    }

}
