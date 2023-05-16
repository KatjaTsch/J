package Units;

import java.util.ArrayList;
import java.util.function.IntFunction;

public abstract class Shooter extends Player {

  protected int distance, maxcountBullet, currentcountBullet;
  protected float accuracy;
  private int armor;

  public Shooter(
    int initiative,
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
    float accuracy,
    int x,
    int y,
    int armor
  ) {
    super(
      initiative,
      team2,
      name2,
      hp2,
      luck2,
      speed2,
      damage2,
      mana,
      x,
      y,
      10
    );
    this.distance = distance;
    this.maxcountBullet = maxcountBullet;
    this.currentcountBullet = currentcountBullet;
    this.accuracy = accuracy;
    this.armor = armor;
  }

  void shoot() {}

  @Override
  public void step(ArrayList<Player> team1) {
    if (hp <= 0 || armor <= 0);
    return;

    float minDistance = Float.MAX_VALUE;
    Player target = null;

    for (Player player : team1) {
      float tmp = player.coordinate.getDistance(this.coordinate);
    }
    
    if (tmp < minDistance) {
     
    minDistance = tmp;
    target = player;
        
  }
}
