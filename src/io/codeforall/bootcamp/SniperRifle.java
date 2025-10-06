package io.codeforall.bootcamp;

public class SniperRifle {
    // bullet damage
    private int bulletDamage;

    public void shoot(Destroyable destroyable){
        int randomizer = (int) ((Math.random() * 100) + 1);
        if (randomizer > 85){
            System.out.println("Missed the shot!");
        } else {
            bulletDamage = (int) ((Math.random() * 5) + 5);
            if (destroyable instanceof SoldierEnemy) {
                System.out.println("Shot it! Took : " + bulletDamage + " damage.");
                destroyable.hit(bulletDamage);
            } else if (destroyable instanceof  ArmouredEnemy) {
                System.out.println("Shot it! Took : " + bulletDamage + " damage.");
                destroyable.hit(bulletDamage);
            } else if (destroyable instanceof Barrel) {
                System.out.println("Shot it! Took : " + bulletDamage + " damage.");
                destroyable.hit(bulletDamage);
            }
        }
    }

}
