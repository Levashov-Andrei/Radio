package ru.Netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;


    public Radio (int stationsCount ){
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
        } else {currentVolume = maxVolume;}
    }

    public void prevVolume() {
        if (currentVolume != minVolume) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }
}

