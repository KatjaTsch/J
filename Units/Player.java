package Units;

import java.util.ArrayList;
import java.util.Random;

/*Крестьянин Разбойник Снайпер Колдун
копейщик арбалетчик монах 
8 полей
4 метода*/

public abstract class Player implements GameInterface {

  protected String name;
  protected float hp, luck, maxhp;
  protected int speed;
  protected int[] damage;
  protected static Random rnd;

  static{
    Player.rnd = new Random();
  }

  protected ArrayList<Player> team;

  public Player(ArrayList<Player> team, String name, float hp, float luck, 
  float maxhp, int speed, int [] damage) {
    this.team = team;
    this.name = name;
    this.hp = hp;
    if(new Random().nextBoolean()) this.hp-=9;
    this.luck = luck;
    this.maxhp = maxhp;   
    this.speed = speed;
    this.damage = damage;
  }

  public Player(String name2, float hp2, float luck2, int speed2, float mana) {
}

public Player(String name2, float hp2, float luck2, int speed2, int i, float mana) {
}

public Player(String name2, int i, int j, int k, int[] ls, int l) {
}

public Player(String name2, float hp2, float luck2, int speed2, int[] damage2, float mana) {
}

public Player(ArrayList<Player> team2, String name2, float hp2, float luck2, int speed2, int[] damage2, float mana) {
}

void attack() {}

  void await() {}

  void defend() {}

  void walk() {}

  void dead() {}

  

  protected void healed (int Hp){
    this.hp = Hp + this.hp > this.maxhp ? this.maxhp : Hp + this.hp;
  }
}
