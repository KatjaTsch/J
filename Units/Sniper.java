package Units;

public class Sniper extends Shooter {

  public Sniper(String name) {
    super(name, 20, 0,6, 2, 4, 5, 10, 30);
  }

  @Override
  public String toString() {
    return "Снайпер:";
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
