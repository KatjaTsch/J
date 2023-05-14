package Units;

import java.util.ArrayList;

public class Crossbowman extends Shooter {

  public Crossbowman(ArrayList<Player> team, String name) {
    super(team, name, 5, 6, 7, new int[] { 1, 2 }, 9, 10, 15, 5, 8);
  }

  @Override
  public String toString() {
    return "Лучник";
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
      damage +
      " расстояние: " +
      distance +
      " макс. кол-во пуль: " +
      maxcountBullet +
      " точность: " +
      accuracy
    );
  }
}
