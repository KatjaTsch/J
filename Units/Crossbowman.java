package Units;

public class Crossbowman extends Shooter {

  public Crossbowman(String name) {
    super(name, 20, 0, 5, 2, 2, 2, 50, 40);
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

  @Override
  public void step() {}
}
