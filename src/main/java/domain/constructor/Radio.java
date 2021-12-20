package domain.constructor;

import java.net.PortUnreachableException;

public class Radio {
    private int currentRadioStation;

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    private int currentVolume;

    public int getCurrentVolume() {

        return currentVolume;
    }


        private int amountRadioStation = 10;

        public int getAmountRadioStation () {
            return amountRadioStation;
        }

    public Radio(int amountRadioStation) {
        this.amountRadioStation = amountRadioStation;
    }

    public Radio () {
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > amountRadioStation) {
            this.currentRadioStation = 0;
        } else if (currentRadioStation < 0) {
            this.currentRadioStation = amountRadioStation;
        } else {
            this.currentRadioStation = currentRadioStation;
        }
    }

    public void setNextRadioStation() {
        int nextRadioStation = currentRadioStation + 1;
        setCurrentRadioStation(nextRadioStation);
    }

    public void setPrevRadioStation() {
        int prevRadioStation = currentRadioStation - 1;
        setCurrentRadioStation(prevRadioStation);
    }

    public void setValidNumberRadioStation(int currentRadioStation) {
        if (currentRadioStation > amountRadioStation) {
            System.out.println("Номер станции недопустим");
        } else if (currentRadioStation < 0) {
            System.out.println("Номер станции недопустим");
        } else {
            setCurrentRadioStation(currentRadioStation);
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            this.currentVolume = 100;
        } else if (currentVolume < 0) {
            this.currentRadioStation = 0;
        } else {
            this.currentVolume = currentVolume;
        }
    }

    public void setNextVolume() {
        int nextVolume = currentVolume + 1;
        setCurrentVolume(nextVolume);
    }

    public void setPrevVolume() {
        int prevVolume = currentVolume - 1;
        setCurrentVolume(prevVolume);
    }
}