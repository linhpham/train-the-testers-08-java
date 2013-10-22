package com.sensis;

public class Main {

    public static void main(String[] args) {
	    int[] evens = {0, 2, 4, 6};
        Person p = new Person();

        System.out.println("Person is doing addition: " + p.doAddition(evens));

        TodayWeatherForecast weatherForecast = new TodayWeatherForecast(true);
        System.out.println("Person is going out with: " + p.thingsToBringWhenGoOut(weatherForecast));
    }
}
