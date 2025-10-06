package io.codeforall.bootcamp;

public class SoldierEnemy extends Enemy{

    public void hit(int bulletDamage){
        super.hit(bulletDamage);
    }

    @Override
    public String toString(){
        return "This one is a regular soldier.\n" +
                "It has " + getHealth() + " Hit points.";
    }
}
