package com.in28minutes.learnspringframework;

public class PacMan implements GamingConsole {
    @Override
    public String toString() {
        return "PacMan Game";
    }

    public void up(){
        System.out.println("Move Up");
    }

    public void down(){
        System.out.println("Move Down");
    }

    public void left(){
        System.out.println("Move Left");
    }

    public void right(){
        System.out.println("Move Right");
    }
}
