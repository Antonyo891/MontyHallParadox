package org.example;

import org.joda.time.DateTime;

public class Main {
    public static void main(String[] args) {
        StringBuilder timeNow = new StringBuilder();
        DateTime dateTime = DateTime.now();
        timeNow.append(dateTime.getYear()).append("-").append(dateTime.getMonthOfYear()).append("-");
        timeNow.append(dateTime.getDayOfMonth()).append(" ");
        timeNow.append(dateTime.getHourOfDay()).append(":").append(dateTime.getMinuteOfHour()).append(".");
        System.out.println("Hello world! The time is " + timeNow);
    }
}