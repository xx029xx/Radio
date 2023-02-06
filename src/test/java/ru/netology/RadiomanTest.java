package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadiomanTest {

    Radioman radio = new Radioman();

    @Test
    void shouldChangeStationTest() {
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(5);

        int expectid = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expectid, actual);
    }

    @Test
    void shouldSetStationUnderMinStationTest() {
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSetStationOverMaxStationTest() {
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldOverMaxStationTest() {
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldPrevStationTest() {
        radio.setCurrentStation(5);
        radio.previousStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    void shouldBelowMinStationTest() {
        radio.setCurrentStation(0);
        radio.previousStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldBelowMinStationTest2() {
        radio.setCurrentStation(-1);
        radio.previousStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldChangeVolumeTest() {
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(50);
        assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    void shouldOverMoreMaxVolumeTest() {
        radio.setCurrentVolume(101);
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    void shouldOverMoreMaxVolumeTest2() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }
    @Test
    void shouldIncreaseVolumeTest() {
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolumeTest() {
        radio.setCurrentVolume(6);
        radio.decreaseVolume();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    void shouldBelowMinVolumeTest() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldBelowMoreMinVolumeTest() {
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}
