package org.example;

import org.joda.time.DateTime;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        final int NUMBERS_OF_GAME = 10000;
        Map<Integer,Boolean> onceChoiceResults = new HashMap<>();
        Map<Integer,Boolean> doubleChoiceResults = new HashMap<>();
        Integer winOnceChoise = 0;
        Integer winDoubleChoise = 0;
        StringBuilder timeNow = new StringBuilder();
        DateTime dateTime = DateTime.now();
        TheMontyHallsGame theMontyHallsGame = new TheMontyHallsGame();
        timeNow.append(dateTime.getYear()).append("-").append(dateTime.getMonthOfYear()).append("-");
        timeNow.append(dateTime.getDayOfMonth()).append(" ");
        timeNow.append(dateTime.getHourOfDay()).append(":").append(dateTime.getMinuteOfHour()).append(".");
        System.out.println("Hello world! The time is " + timeNow);
        for (int i = 0; i < NUMBERS_OF_GAME; i++) {
            onceChoiceResults.put(i,theMontyHallsGame.playGameWithOnceChoice());
            doubleChoiceResults.put(i,theMontyHallsGame.playGameWithDoubleChoice());
        }
        for (Map.Entry<Integer,Boolean> entry:onceChoiceResults.entrySet()) {
            if (entry.getValue()==true) winOnceChoise++;
        }
        for (Map.Entry<Integer,Boolean> entry:doubleChoiceResults.entrySet()) {
            if (entry.getValue()==true) winDoubleChoise++;
        }
        System.out.printf("The number of wins with one choice - %d" +
                "\nThe number of wins with double choice - %d\n", winOnceChoise,winDoubleChoise);
    }
}