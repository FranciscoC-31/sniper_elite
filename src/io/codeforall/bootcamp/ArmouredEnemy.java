package io.codeforall.bootcamp;

public class ArmouredEnemy extends Enemy{

    private int armour;

    public ArmouredEnemy(){
        armour = 10;
    }

    @Override
    public void hit(int bulletDamage){
        if ( armour >= 0) {
            armour -= bulletDamage;
            System.out.println("It hit the armour!");

            if (armour < 0) {
                System.out.println("Armour destroyed!");
            }
        }
        else {
            super.hit(bulletDamage);
        }
    }

    @Override
    public String toString(){
        return "Spotted an enemy soldier. And this one has armour!\n" +
                "It has " + getHealth() + " Hit points and " + armour + " armour Hit points.";
    }
}
