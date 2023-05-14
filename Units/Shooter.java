package Units;

import java.util.ArrayList;

public abstract class Shooter extends Player {

  protected int distance, maxcountBullet, currentcountBullet;
  protected float accuracy;

  public Shooter(
    ArrayList<Player> team2,
    String name2,
    float hp2,
    float luck2,
    int speed2,
    int[] damage2,
    float mana,
    int distance,
    int maxcountBullet,
    int currentcountBullet,
    float accuracy
  ) {
    super(team2, name2, hp2, luck2, speed2, damage2, mana);
    this.distance = distance;
    this.maxcountBullet = maxcountBullet;
    this.currentcountBullet = currentcountBullet;
    this.accuracy = accuracy;
  }

  void shoot() {}
}
