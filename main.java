import Units.Crossbowman;
import Units.Monk;
import Units.Player;
import Units.Sniper;
import Units.Thief;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class main {

  
  public static void main(String[] args, Comparator<? super Player> CompareTo) {

    ArrayList<Player> team1 = new ArrayList<>();
    ArrayList<Player> team2 = new ArrayList<>();
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

    int teamSize = 4;

    for (int i = 0; i < teamSize; i++) {
      switch (new Random().nextInt(1, 5)) {
        case 0:
          team1.add(new Sniper(team1, "Kate"));
          break;
        case 1:
          team1.add(new Crossbowman(team1, "Vik"));
          break;
        case 2:
          team1.add(new Monk(team1, "Max"));
          break;
        case 3:
          team1.add(new Thief(team1, "Wulf"));
          break;
      }
    }

    
    for (int j = 0; j < teamSize; j++) {
      switch (new Random().nextInt(1, 5)) {
        case 0:
          team2.add(new Sniper(team2, "Kate"));
          break;
        case 1:
          team2.add(new Crossbowman(team2, "Vik"));
          break;
        case 2:
          team2.add(new Monk(team2, "Max"));
          break;
        case 3:
          team2.add(new Thief(team2, "Wulf"));
          break;
      }

      team1.forEach(n -> System.out.println(n.getInfo()));
      team2.forEach(n -> System.out.println(n.getInfo()));

      team2.forEach(unit -> unit.step());
      team2.sort(CompareTo);
      System.out.println(team2);

           
    }
    // static String getName(){
    //   return String.valueOf(Names.values()[new Random().nextInt(Names.values().lenght)]);
    // }
  }
}
