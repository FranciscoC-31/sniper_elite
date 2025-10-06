package io.codeforall.bootcamp;

public class Enemy extends GameObject implements Destroyable {
    @Override
    public String getMessage(){
        return "It's an enemy. Shoot it!";
    }
    private int health;
    private boolean dead;

    public Enemy(){
        health = (int) ((Math.random() * 10) + 10);
    }

    @Override
    public boolean isDestroyed(){
        return dead;
    }

    @Override
    public void hit(int bulletDamage){
        health -= bulletDamage;
        if (health <= 0){
            health = 0;
            dead = true;
            System.out.println("Confirmed Kill\n");
        }
    }

    public int getHealth(){
        return this.health;
    }
}
