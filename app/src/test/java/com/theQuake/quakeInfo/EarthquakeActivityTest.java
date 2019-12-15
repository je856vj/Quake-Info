package com.theQuake.quakeInfo;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EarthquakeActivityTest {

    private EarthquakeActivity earthquakeActivity = new EarthquakeActivity();

    @Test
    public void getAverageMagnitude() {
        List<Float> input = new ArrayList<>();

        input.add(4f);
        float expected = 4f;
        double delta = .001;
        float actual = earthquakeActivity.getAverageMagnitude(input);

        // Assert checks correct behavior --- case - 1 item ---
        assertEquals(expected,actual,delta);

        input.add(3.7f);
        input.add(5.61f);
        input.add(8f);
        expected = 5.3275f;
        actual = earthquakeActivity.getAverageMagnitude(input);

        // Assert checks correct behavior --- case - multiple items ---
        assertEquals(expected,actual,delta);

        input.clear();
        expected = 0f;
        actual = earthquakeActivity.getAverageMagnitude(input);

        // Assert checks correct behavior --- case - empty list ---
        assertEquals(expected,actual,delta);
    }

    @Test
    public void getMaxMagnitude() {
        List<Float> input = new ArrayList<>();

        input.add(4.52f);

        float expected = 4.52f;
        double delta = .001;
        float actual = earthquakeActivity.getMaxMagnitude(input);

        // Assert checks correct behavior --- case - 1 item ---
        assertEquals(expected,actual,delta);

        input.add(3.17f);
        input.add(7.95f);
        input.add(5.8f);
        expected = 7.95f;
        delta = .001;
        actual = earthquakeActivity.getMaxMagnitude(input);

        // Assert checks correct behavior --- case - multiple items ---
        assertEquals(expected,actual,delta);

        input.clear();
        expected = 0.0f;
        actual = earthquakeActivity.getMaxMagnitude(input);

        // Assert checks correct behavior --- case - empty list ---
        assertEquals(expected,actual,delta);
    }

    @Test
    public void getUpdatedQuakeLocations() {
        List<String> inputList = new ArrayList<>();
        String inputString = "NewLocation";

        String expected = "New earthquake location :" + inputString + ". Current locations = " + 1;
        String actual = earthquakeActivity.getUpdatedQuakeLocations(inputList,inputString);

        // Assert checks correct behavior --- case - 1 item ---
        assertEquals(expected,actual);

        inputList.add("location2");
        inputList.add("location3");
        inputString = "location4";
        expected = "New earthquake location :" + inputString + ". Current locations = " + String.valueOf(inputList.size()+1);
        actual = earthquakeActivity.getUpdatedQuakeLocations(inputList,inputString);

        // Assert checks correct behavior --- case - multiple items ---
        assertEquals(expected,actual);

        inputString = "location3";
        expected = "Location already exists in the list";
        actual = earthquakeActivity.getUpdatedQuakeLocations(inputList,inputString);

        // Assert checks correct behavior --- case - item already exists in the list ---
        assertEquals(expected,actual);
    }

}