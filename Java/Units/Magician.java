package Units;

import java.util.ArrayList;
import java.util.Random;

public abstract class Magician extends Player {

  protected float mana;

  protected Magician(int initiative,
    ArrayList<Player> team,
    String name,
    float hp,
    float luck,
    int speed,
    int[] damage,
    float mana, int x, int y
  ) {
    super(initiative, team, name, hp, luck, speed, damage, mana, x, y);
    this.mana = mana;
  }

  protected void Heal(Player target) {
    target.healed(new Random().nextInt(this.damage[0], this.damage[1]));
  }

  @Override
  public void step(ArrayList<Player> team1) {
    int index_demaget = 0;
    for (int i = 0; i < team.size(); i++) {
      for (int j = 0; j < team.size() - 1; j++) {
        if (
          team.get(i).hp /
          team.get(i).maxhp <
          team.get(j).hp /
          team.get(j).maxhp
        ) {
          index_demaget = i;
        }
        team.get(index_demaget).healed(new Random().nextInt(this.damage[0], this.damage[1]));
      }
    }
  }

  @Override
  public String getInfo() {
    return null;
  }
}
