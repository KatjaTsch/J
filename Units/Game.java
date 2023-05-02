package Units;

public class Game {
    public static void main(String[] args) {
        Sniper sniper = new Sniper("Kate");
        System.out.println(sniper);

        Monk monk = new Monk("Max");
        System.out.println(monk);
        
        Peasant peasant = new Peasant("Vlad");
        System.out.println(peasant);

        Spearman spearman = new Spearman("Nik");
        System.out.println(spearman);

        Thief thief = new Thief("Wulf");
        System.out.println(thief);

        Crossbowman crossbowman = new Crossbowman("Vik");
        System.out.println(crossbowman);

    }
}
