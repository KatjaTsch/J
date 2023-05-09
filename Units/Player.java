package Units;

/*Крестьянин Разбойник Снайпер Колдун
копейщик арбалетчик монах 
8 полей
4 метода*/

public abstract class Player implements GameInterface {

  protected static String name;
  protected float hp, luck;
  protected int speed, damage;

  public Player(String name, float hp, float luck, int speed, int damage, int i) {
    Player.name = name;
    this.hp = hp;
    this.luck = luck;
    this.speed = speed;
    this.damage = damage;
  }

  public Player(String name2, float hp2, float luck2, int speed2, int damage2) {
}

void attack() {}

  void await() {}

  void defend() {}

  void walk() {}

  void dead() {}
}
