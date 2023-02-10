package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadiomanTest {

    Radioman radio = new Radioman();

    @Test
    public void testBoundaryValueStationMin1() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual  = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
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
    public void testBoundaryValueStationMax1() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(10);

        int expected = 0;
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
    public void testNextStation1() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(5);

        radio.nextStation();

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStation2() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStation3() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(0);

        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStation4() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(1);

        radio.nextStation();

        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStation5() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(8);

        radio.nextStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void testPrevStation1() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(0);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void testPrevStation2() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(1);

        radio.prevStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void testPrevStation3() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(9);

        radio.prevStation();

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void testPrevStation4() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(8);

        radio.prevStation();

        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void testPrevStation5() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(5);

        radio.prevStation();

        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void testNextVolume1() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(50);

        radio.nextVolume();

        int expected = 51;
        int actual = radio.getCurrentVolume();
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
    public  void testNextVolume3() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(99);

        radio.nextVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void testNextVolume4() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(0);

        radio.nextVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void testNextVolume5() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(1);

        radio.nextVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void testPrevVolume1() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(50);

        radio.prevVolume();

        int expected = 49;
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
    public  void testPrevVolume3() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(1);

        radio.prevVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void testPrevVolume4() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(100);

        radio.prevVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void testPrevVolume() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(99);

        radio.prevVolume();

        int expected = 98;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCreate() {
        Radioman radioman = new Radioman();
    }
}
