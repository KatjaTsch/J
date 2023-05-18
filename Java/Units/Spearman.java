package Units;

import java.util.ArrayList;

public class Spearman extends Player{
    
    public Spearman(ArrayList<Player> team, String name, int x, int y){
        super(3, team, name, 30, 21, 6, new int[]{1,2}, 2, x, y);
    }
    @Override
    public String toString() {
        return name;
    }
   
    @Override
    public String getInfo() {
        return name + " здоровье: " + hp + " везение: " + luck + " скорость: " + speed 
    + " ущерб: " + damage + "инициатива" + initiative;
    }
    @Override
    public void step(ArrayList<Player> team1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'step'");
    }

}
