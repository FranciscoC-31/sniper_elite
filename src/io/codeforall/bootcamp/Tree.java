package io.codeforall.bootcamp;

public class Tree extends GameObject {
    @Override
    public String getMessage(){
        return "";
    }

    @Override
    public String toString(){
        return "Spotted a tree. It's a decoy.\n" +
                "Moving on to next target.\n";
    }
}
