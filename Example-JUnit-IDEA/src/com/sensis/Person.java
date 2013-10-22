package com.sensis;

public class Person {

    /**
     * @param array
     * @return The sum of the array's elements.
     */
    public int doAddition(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }

    /**
     * @param forecast
     * @return "Nice clothes" when sunny, "Nice clothes and an umbrella" when not sunny.
     */
    public String thingsToBringWhenGoOut(TodayWeatherForecast forecast) {
        if (forecast.isSunny()) {
            return "Nice clothes";
        } else {
            return "Nice clothes and an umbrella";
        }
    }
}
