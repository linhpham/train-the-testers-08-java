package com.sensis;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class PersonUnitTest {

    private Person p;

    @Before
    public void setUp() {
        p = new Person();
    }

    @After
    public void tearDown() {

    }

    @Test
    public void testDoAddition() {
        int[] array = {1, 2, 3, 4, 5};
        Assert.assertEquals(15, p.doAddition(array));
    }

    @Test
    public void testThingsToBringWhenGoOut() {
        TodayWeatherForecast mockWeather = Mockito.mock(TodayWeatherForecast.class);
        Mockito.when(mockWeather.isSunny()).thenReturn(Boolean.TRUE);

        Assert.assertEquals("Nice clothes", p.thingsToBringWhenGoOut(mockWeather));
    }

    @Test
    public void testThingsToBringWhenGoOutWhenNotSunny() {
        TodayWeatherForecast mockWeather = Mockito.mock(TodayWeatherForecast.class);
        Mockito.when(mockWeather.isSunny()).thenReturn(Boolean.FALSE);

        Assert.assertEquals("Nice clothes and an umbrella", p.thingsToBringWhenGoOut(mockWeather));
    }








    /*@Test
    public void testThingsToBringWhenGoOutNotSunny() {
        TodayWeatherForecast weather = Mockito.mock(TodayWeatherForecast.class);
        Mockito.when(weather.isSunny()).thenReturn(true);
        String result = p.thingsToBringWhenGoOut(weather);
        Assert.assertEquals("Nice clothes", p.thingsToBringWhenGoOut(weather));
    }*/
}
