package ru.Netology;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;
    private int minStation;
    private int maxVolume;
    private int minVolume;

    public Radio(){
        maxStation = 9;
        minStation = 0;
        maxVolume = 100;
        minVolume = 0;


    }
public Radio (int stationsCount){
        maxStation = stationsCount - 1;
}


    public void next() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void prev() {
        if (currentStation != minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void nextVolume() {
        if (currentVolume != maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void prevVolume() {
        if (currentVolume != minVolume) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }


}
