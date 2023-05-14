package Units;

import java.util.ArrayList;

public class Thief extends Player {

  

  public Thief(ArrayList<Player> team, String name){
    super(team, name, 8, 2, 3, new int []{1,2}, 10);
  }

  void dodge() {}

  void stealth() {}

  @Override
  public String toString() {
    return name;
  }

  @Override
  public String getInfo() {
    return (
      name +
      " здоровье: " +
      hp +
      " везение: " +
      luck +
      " скорость: " +
      speed +
      " ущерб: " +
      damage
    );
  }

  
}
