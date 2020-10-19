package com.quizapp;

public class Main {

    public static void main(String[] args) {
        // Quiz application
//        questions, players, playground -> entities required

        Game game=new Game();
        game.initGame();
        game.play();

    }
}
