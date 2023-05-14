package Units;

import java.util.ArrayList;

public class Peasant extends Player {

 
  public Peasant(ArrayList<Player> team, String name) {
    super(1, team, name, 8, 9, 10, new int[] { 1, 2 }, 4);
  }

  @Override
  public String toString() {
    return name;
  }

  @Override
  public String getInfo() {
    return name;
  }

  @Override
  public void step() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'step'");
  }
}
