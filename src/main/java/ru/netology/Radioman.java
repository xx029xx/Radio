package ru.netology;

public class Radioman {

    private int currentStation;
    private int minStation = 0;
    private int maxStation = 9;
    private int totalStation = 10;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radioman() {
        this.totalStation = totalStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation || currentStation > totalStation -1) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation -1 <= currentStation) {
            setCurrentStation(minStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void previousStation() {
        if (currentStation <= minStation) {
            setCurrentStation(totalStation -1);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume || currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
