import Units.Crossbowman;
import Units.Monk;
import Units.Peasant;
import Units.Player;
import Units.Sniper;
import Units.Spearman;
import Units.Thief;
import java.util.ArrayList;
import java.util.Random;

public class main {

  public static void main(String[] args) {
    Sniper sniper = new Sniper("Kate");
    System.out.println(sniper.getInfo());

    Monk monk = new Monk("Max");
    System.out.println(monk);

    Peasant peasant = new Peasant("Vlad");
    System.out.println(peasant);

    Spearman spearman = new Spearman("Nik");
    System.out.println(spearman);

    Thief thief = new Thief("Wulf");
    System.out.println(thief);

    Crossbowman crossbowman = new Crossbowman("Vik");
    System.out.println(crossbowman.getInfo());

    ArrayList<Player> team1 = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      switch (new Random().nextInt(4)) {
        case 0:
          team1.add(new Sniper("Kate"));
          break;
        case 1:
          team1.add(new Crossbowman("Vik"));
          break;
        case 2:
          team1.add(new Monk("Max"));
          break;
        case 3:
          team1.add(new Thief("Wulf"));
          break;
      }
    }

    ArrayList<Player> team2 = new ArrayList<>();
    for (int j = 0; j < 10; j++) {
      switch (new Random().nextInt(4)) {
        case 0:
          team2.add(new Sniper("Kate"));
          break;
        case 1:
          team2.add(new Crossbowman("Vik"));
          break;
        case 2:
          team2.add(new Monk("Max"));
          break;
        case 3:
          team2.add(new Thief("Wulf"));
          break;
      }

      team1.forEach(n -> System.out.println(n.getInfo()));
      team2.forEach(n -> System.out.println(n.getInfo()));
    }
  }
}