package Units;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/*Крестьянин Разбойник Снайпер Колдун
копейщик арбалетчик монах 
8 полей
4 метода*/

public abstract class Player implements GameInterface {

  protected int initiative;
  protected String name;
  protected float hp, luck, maxhp;
  protected int speed;
  protected int[] damage;
  protected static Random rnd;

  static {
    Player.rnd = new Random();
  }

  protected ArrayList<Player> team;
  protected Coordinate coordinate;
  protected ArrayList<Player> enemy;

  protected Player(
    int initiative,
    ArrayList<Player> team,
    String name,
    float hp,
    float luck,
    float maxhp,
    int[] damage,
    float mana, int speed, int x, int y
  ) {
    this.team = team;
    this.name = name;
    this.hp = hp;
    if (new Random().nextBoolean()) this.hp -= 9;
    this.luck = luck;
    this.maxhp = maxhp;
    this.speed = speed;
    this.damage = damage;
    this.initiative = initiative;
    this.coordinate = new Coordinate(x, y);
  }

  public String getInfo() {
    return String.format(
      "Name: %s Heals: %d Type %s Damage Initiative: %d" ,
      this.name,
      this.hp,
      this.getClass().getSimpleName(),
      Arrays.toString(this.damage), this.initiative
    );
  }

  protected void healed(int Hp) {
    this.hp = Hp + this.hp > this.maxhp ? this.maxhp : Hp + this.hp;
  }

  public Player(String name2, float hp2, float luck2, int speed2, float mana) {}

  public Player(
    String name2,
    float hp2,
    float luck2,
    int speed2,
    int i,
    float mana
  ) {}

  public Player(int initiative2, ArrayList<Player> team2, String name2, int i, int j, int k, int[] ls, int l) {}

  public Player(
    String name2,
    float hp2,
    float luck2,
    int speed2,
    int[] damage2,
    float mana
  ) {}

  public Player(
    int initiative2, ArrayList<Player> team2,
    String name2,
    float hp2,
    float luck2,
    int speed2,
    int[] damage2,
    float mana, int x, int y, int i
  ) {}

  public Player(int initiative2, ArrayList<Player> team2, String name2, float hp2, float luck2, int speed2,
      int[] damage2, float mana) {
  }

  public Player(int initiative2, ArrayList<Player> team2, String name2, float hp2, 
  float luck2, int speed2, int[] damage2, float mana, int x, int y) {
  }

  void attack() {}

  void await() {}

  void defend() {}

  void walk() {}

  void dead() {}

  @Override
  public void step(ArrayList<Player> team1) {
    
    
  }

  // @Override
  // public int compareTo(Object o) {
  //   Player player = (Player)o;
  //   return player.initiative-this.initiative; 
  // }

 
}
