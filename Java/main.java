import Units.Crossbowman;
import Units.Monk;
import Units.Player;
import Units.Sniper;
import Units.Thief;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class main {

  private static Comparator<? super Player> compareTo;
  public static ArrayList<Player> team1 = new ArrayList<>();
  public static ArrayList<Player> team2 = new ArrayList<>();
  public static ArrayList<Player> team3 = new ArrayList<>();

  public static void main (String[] args) {
    // Sniper sniper = new Sniper(team1, "Kate");
    // System.out.println(sniper.getInfo());

    // Monk monk = new Monk(team1, "Max");
    // System.out.println(monk);

    // Peasant peasant = new Peasant(team1, "Vlad");
    // System.out.println(peasant);

    // Spearman spearman = new Spearman(team1, "Nik");
    // System.out.println(spearman);

    // Thief thief = new Thief(team1, "Wulf");
    // System.out.println(thief);

    // Crossbowman crossbowman = new Crossbowman(team1, "Vik");
    // System.out.println(crossbowman.getInfo());

    for (int i = 0; i < 10; i++) {
      switch (new Random().nextInt(1, 5)) {
        case 0:
          team1.add(new Sniper(team1, "Kate", 1, i));
          break;
        case 1:
          team1.add(new Crossbowman(team1, "Vik", 1, i));
          break;
        case 2:
          team1.add(new Monk(team1, "Max", 1, i));
          break;
        case 3:
          team1.add(new Thief(team1, "Wulf", 1, i));
          break;
      }
    }

    for (int j = 1; j < 11; j++) {
      switch (new Random().nextInt(1, 5)) {
        case 0:
          team2.add(new Sniper(team2, "Kate", 10, j));
          break;
        case 1:
          team2.add(new Crossbowman(team2, "Vik", 10, j));
          break;
        case 2:
          team2.add(new Monk(team2, "Max", 10, j));
          break;
        case 3:
          team2.add(new Thief(team2, "Wulf", 10, j));
          break;
      }

      // team1.forEach(n -> System.out.println(n.getInfo()));
      // team2.forEach(n -> System.out.println(n.getInfo()));

      team2.forEach(unit -> unit.step(team1));
      team2.sort(compareTo);
      // System.out.println(team2);
      team1.forEach(unit -> unit.step(team2));
    }
    // static String getName(){
    //   return String.valueOf(Names.values()[new Random().nextInt(Names.values().lenght)]);
    // }
    team3.addAll(team1);
    team3.addAll(team2);
    // System.out.println(team3);

    team3.sort(
      new Comparator<Player>() {
        @Override
        public int compare(Player o1, Player o2) {
          return o2.speed - o1.speed;
        }
      }
    );

    while(true){
      System.out.println(View.view());
    }
  }
}
