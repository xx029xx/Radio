package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadiomanTest {

    Radioman radio = new Radioman();


    @Test
    public void testBoundaryValueStationMin2() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(0);

        int expected = 0;
        int actual  = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryValueStationMin3() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(1);

        int expected = 1;
        int actual  = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryValueStationMax2() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(9);

        int expected = 9;
        int actual  = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryValueStationMax3() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(8);

        int expected = 8;
        int actual  = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverageValueStation() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(5);

        int expected = 5;
        int actual  = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void testNextVolume2() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(100);

        radio.nextVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void testPrevVolume2() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(0);

        radio.prevVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCreate() {
        Radioman radioman = new Radioman();
    }
}
