package com.in28minutes.learnspringframework;

public class GameRunner {

    // Whatever game we passed in the constructor, we will run that game
    GamingConsole game;

    public GameRunner(GamingConsole game){
        this.game = game;
    }



    public void run(){
        System.out.println("Running the game..." + game);
        // These are the function from the GamingConsole interface
        // Go to the GamingConsole interface to see the function definition
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
