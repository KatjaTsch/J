package Units;

import java.util.ArrayList;

public class Monk extends Magician {

  public Monk(ArrayList<Player> team, String name, int x, int y) {
    super(3, team, name, 13, 2, 10, new int[] { 1, 2 }, 5, x, y);
  }

  void Heal() {}

  @Override
  public String toString() {
    return name;
  }

  @Override
  public String getInfo() {
    return String.format("%s mana: %d  luck", super.getInfo());
  }
}
