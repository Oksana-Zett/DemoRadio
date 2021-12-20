package domain;

public class Radio {
    private int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > 9) {
            this.currentRadioStation = 0;
        } else if (currentRadioStation < 0) {
            this.currentRadioStation = 9;
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
        if (currentRadioStation > 9) {
            System.out.println("Номер станции недопустим");
        } else if (currentRadioStation < 0) {
            System.out.println("Номер станции недопустим");
        } else {
            setCurrentRadioStation(currentRadioStation);
        }
    }

    private int currentVolume;

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            this.currentVolume = 10;
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