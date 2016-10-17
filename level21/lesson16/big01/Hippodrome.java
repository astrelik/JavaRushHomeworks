package com.javarush.test.level21.lesson16.big01;

/**
 * Created by strel on 19/09/2016.
 */

import java.util.ArrayList;

public class Hippodrome
{
    private static ArrayList<Horse> horses = new ArrayList<>();
    public ArrayList<Horse> getHorses() { return horses; }

         public static Hippodrome game;


    public static void main(String[] args) throws InterruptedException
    {

        game = new Hippodrome();  //new game

        Horse horse1 = new Horse("horse1", 3, 0);
        Horse horse2 = new Horse("horse2", 3, 0);
        Horse horse3 = new Horse("horse3", 3, 0);

        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);

        game.run();
        game.printWinner();

    }

    public void run()throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(500);
        }


    }

    public void move(){
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).move();
        }

    }

    public void print(){
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).print();
        }
        System.out.println();
        System.out.println();
    }

    public Horse getWinner() {

        Horse winner = null;

        for (Horse h : getHorses()) {
            if (winner == null) {
                winner = h;
            }
            else {
                if (winner.getDistance() < h.getDistance()) {
                    winner = h;
                }
            }
        }

        return winner;
    }

    public void printWinner() {

        System.out.println("Winner is " + getWinner().getName() + "!");

    }
}
