package Units;

import java.util.ArrayList;

public class Peasant extends Player {

 
  public Peasant(ArrayList<Player> team, String name, int x, int y) {
    super(1, team, name, 8, 9, 10, new int[] { 1, 2 }, 4, x, y);
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
  public void step(ArrayList<Player> team1) {
    throw new UnsupportedOperationException("Unimplemented method 'step'");
  }
}
