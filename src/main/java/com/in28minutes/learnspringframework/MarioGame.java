package com.in28minutes.learnspringframework;

public class MarioGame implements GamingConsole {
    @Override
    public String toString() {
        return "Mario Game";
    }

    public void up(){
        System.out.println("Jump");
    }

    public void down(){
        System.out.println("Crouch");
    }

    public void left(){
        System.out.println("Go back");
    }


    public void right(){
        System.out.println("Go forward");
    }

}
