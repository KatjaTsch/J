package Units;
public class Shooter extends soop_1{
    
    protected int distance, maxcountBullet, currentcountBullet;
    protected float accuracy;
    
    Shooter(String name, float hp, float luck, int speed, int damage, int distance, int maxcountBullet, float accuracy){
        super(name, hp, luck, speed, damage);
        this.distance = distance;
        this.maxcountBullet = maxcountBullet;
        this.currentcountBullet = maxcountBullet;
        this.accuracy = accuracy;
    }


    void shoot(){

    }
 
}

