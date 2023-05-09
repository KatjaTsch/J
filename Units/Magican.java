package Units;

public class Magican extends Player {

  protected float mana;

  Magican(
    String name,
    float hp,
    float luck,
    int speed,
    int damage,
    float mana, int i
  ) {
    super(name, hp, luck, speed, damage);
    this.mana = mana;
  }

  void Heal() {}

  @Override
  public void step() {
    
  }

  @Override
  public String getInfo() {
    return null;
  }
}
