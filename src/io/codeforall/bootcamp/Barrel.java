package io.codeforall.bootcamp;

public class Barrel extends GameObject implements Destroyable{
    private boolean destroyed;
    private int currentDamage;
    private BarrelType barrelType;

    public Barrel(){
        destroyed = false;
        currentDamage = 0;
        int randomizer = (int)(Math.random() * 3);
        switch (randomizer){
            case 0:
                this.barrelType = BarrelType.PLASTIC;
                break;
            case 1:
                this.barrelType = BarrelType.WOOD;
                break;
            case 2:
                this.barrelType = BarrelType.METAL;
                break;
        }
    }

    @Override
    public boolean isDestroyed(){
        return destroyed;
    }

    @Override
    public void hit(int bulletDamage ){
        currentDamage += bulletDamage;

        if (currentDamage >= barrelType.getMaxDamage()){
            destroyed = true;
            System.out.println("Barrel Destroyed!\n");
        }
    }

    @Override
    public String toString(){
        return "Spotted a " + barrelType + " barrel.\n" +
                "It has " + barrelType.getMaxDamage() + " Hit points. MUST obliterate it!";
    }

    @Override
    public String getMessage() {
        return "";
    }
}
