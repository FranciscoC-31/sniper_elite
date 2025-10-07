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

    private GameObject createObjects(){
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
        }
        System.out.println("Shots fired: " + shotsFired);
    }
}
