package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TheMontyHallsGame {
    private static final Integer NUMBERS_OF_THE_DOORS = 3;
    private static Door [] doors;
    private static Integer NUMBER_OF_THE_WIN_DOOR;
    private static Random random;

    private void createGame() {
        random = new Random();
        NUMBER_OF_THE_WIN_DOOR = random.nextInt(1,4);
        createdDoors();
    }
    private static void createdDoors(){
        doors = new Door[NUMBERS_OF_THE_DOORS];
        for (int i = 0; i < NUMBERS_OF_THE_DOORS ; i++) {
            if (i!=NUMBER_OF_THE_WIN_DOOR-1) doors[i] = (new Door(i+1));
            else doors[i] = (new Door(i+1,Prize.CAR));
        }
    }
    public Boolean playGameWithDoubleChoice(){
        createGame();
        int choice = random.nextInt(1,4);
        int numberDeletedDoor;
        do {
            numberDeletedDoor = new Random().nextInt(1,4);
        } while ((numberDeletedDoor == NUMBER_OF_THE_WIN_DOOR)||
                (numberDeletedDoor == choice));
        do {
            choice = random.nextInt(1,4);
        } while (choice == numberDeletedDoor);
        return doors[choice - 1].getPrize() == Prize.CAR;
    }
    public Boolean playGameWithOnceChoice(){
        createGame();
        int choice = random.nextInt(1,4);
        int numberDeletedDoor;
        do {
            numberDeletedDoor = new Random().nextInt(1,4);
        } while ((numberDeletedDoor == NUMBER_OF_THE_WIN_DOOR)||
                (numberDeletedDoor == choice));
        return doors[choice - 1].getPrize() == Prize.CAR;
    }
}
