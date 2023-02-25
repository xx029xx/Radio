package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadiomanTest {
    Radioman station = new Radioman(10, 50);


    @Test
    public void stationTest() {
        int maxStation = 10;
        int actual = station.getMaxStation();
        int expected = maxStation;
        assertEquals(expected, actual);
    }
}