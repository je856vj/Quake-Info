package com.theQuake.quakeInfo;

import org.junit.Test;

import static org.junit.Assert.*;

public class EarthquakeTest {

    @Test
    public void getMagnitude() {

        double input = 6.7;
        Earthquake earthquake  = new Earthquake(input,"",0,"");
        double expected = input;
        double delta = .001;
        double actual = earthquake.getMagnitude();

        // Assert checks correct behavior --- case double value ---
        assertEquals(expected,actual,delta);

        input = 0;
        earthquake  = new Earthquake(input,"",0,"");
        expected = input;
        delta = .001;
        actual = earthquake.getMagnitude();

        // Assert checks correct behavior --- case 0 value ---
        assertEquals(expected,actual,delta);
    }

    @Test
    public void getLocation() {

        String input = "New Location";
        Earthquake earthquake  = new Earthquake(0,input,0,"");
        String expected = input;
        String actual = earthquake.getLocation();

        // Assert checks correct behavior --- case new value ---
        assertEquals(expected,actual);

        input = "";
        earthquake  = new Earthquake(0,input,0,"");
        expected = input;
        actual = earthquake.getLocation();

        // Assert checks correct behavior --- case empty value ---
        assertEquals(expected,actual);
    }

    @Test
    public void getTimeInMilliseconds() {
        long input = 625;
        Earthquake earthquake  = new Earthquake(0,"",input,"");
        double expected = input;
        double delta = .001;
        double actual = earthquake.getTimeInMilliseconds();

        // Assert checks correct behavior --- case double value ---
        assertEquals(expected,actual,delta);

        input = 0;
        earthquake  = new Earthquake(input,"",0,"");
        expected = input;
        delta = .001;
        actual = earthquake.getMagnitude();

        // Assert checks correct behavior --- case 0 value ---
        assertEquals(expected,actual,delta);

    }

    @Test
    public void getUrl() {
        String input = "New URL";
        Earthquake earthquake  = new Earthquake(0,"",0,input);
        String expected = input;
        String actual = earthquake.getUrl();

        // Assert checks correct behavior --- case new value ---
        assertEquals(expected,actual);

        input = "";
        earthquake  = new Earthquake(0,input,0,"");
        expected = input;
        actual = earthquake.getUrl();

        // Assert checks correct behavior --- case empty value ---
        assertEquals(expected,actual);
    }
}