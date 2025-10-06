package io.codeforall.bootcamp;

import java.util.Arrays;

public class Game {
    private  GameObject[] objects;
    private SniperRifle sniperRifle;
    private int shotsFired;

    //constructor
    public Game(){
        shotsFired = 0;
        objects = new GameObject[10];
        sniperRifle = new SniperRifle();
    }

    public GameObject createObjects(){
        // store chosen object in array
            int randomizer = (int) (Math.random() * 5);
            if (randomizer == 0) {
                return new Tree();
            } else if (randomizer == 1) {
                return new Barrel();
            } else {
                double enemyRandomizer = Math.random();
                if (enemyRandomizer >= 0.5) {
                    return new ArmouredEnemy();
                } else {
                    return new SoldierEnemy();
                }
            }
    }


    public void start(){
        for(int i = 0; i < objects.length; i++) {
            objects[i] = createObjects();
        }
        for(int i = 0; i < objects.length; i++){
            System.out.println(objects[i].toString());

            while (objects[i] instanceof Destroyable && !((Destroyable) objects[i]).isDestroyed()){

                sniperRifle.shoot((Destroyable) objects[i]);
                shotsFired++;
            }

            /*if (objects[i] instanceof Tree) {
                System.out.println(" 1" + objects[i].toString());
                System.out.println();

            } else if (objects[i] instanceof Enemy) {
                boolean dead = ((Enemy) objects[i]).isDestroyed();
                
                System.out.println(objects[i].getMessage());
                System.out.println("Enemy health: " + ((Enemy) objects[i]).getHealth());

                if (objects[i] instanceof SoldierEnemy){
                    System.out.println("This one is a regular soldier.");
                } else if (objects[i] instanceof  ArmouredEnemy) {
                    System.out.println("This one has armour. I gotta break through it!");
                }

                while(!dead) {
                sniperRifle.shoot((Destroyable) objects[i]);
                shotsFired++;
                dead = ((Enemy) objects[i]).isDestroyed();
                }
            } else if (objects[i] instanceof Barrel){
               System.out.println(objects[i].getMessage());
               boolean destroyed = ((Barrel) objects[i]).isDestroyed();

                System.out.println("Barrel Hit points: " + (((Barrel) objects[i]).getMaxDamage()));
               while (!destroyed){
                   sniperRifle.shoot((Barrel) objects[i]);
                   shotsFired++;
                   destroyed = (((Barrel) objects[i]).isDestroyed());
               }
            }*/
        }
        System.out.println("Shots fired: " + shotsFired);
    }
}
