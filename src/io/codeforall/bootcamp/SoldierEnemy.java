package io.codeforall.bootcamp;

public class SoldierEnemy extends Enemy{

    public void hit(int bulletDamage){
        super.hit(bulletDamage);
    }

    @Override
    public String toString(){
        return "Spotted an enemy soldier.\n" +
                "It has " + getHealth() + " Hit points.";
    }
}
