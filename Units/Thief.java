package Units;

public class Thief extends Player {

  public Thief(String name) {
    super(name, 20, 0,8, 3, 8);
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

  @Override
  public void step() {}
}
