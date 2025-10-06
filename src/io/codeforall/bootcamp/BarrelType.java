package io.codeforall.bootcamp;

public enum BarrelType {
    PLASTIC(10),
    WOOD(20),
    METAL(30);

    private int maxDamage;

    //constructor
    private BarrelType(int maxDamage){
        this.maxDamage = maxDamage;
    }

    public int getMaxDamage(){
        return maxDamage;
    }
}

