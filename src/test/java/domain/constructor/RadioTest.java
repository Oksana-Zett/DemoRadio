package domain.constructor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioTest {


    @Test

    public void shouldUseConstructor () {
        Radio radio = new Radio(5);

        assertEquals (5,radio.getAmountRadioStation());
    }

    @Test
    public void shouldUseNoArgsConstructor () {
        Radio radio = new Radio();

        assertEquals(10, radio.getAmountRadioStation());
    }

    // Тестирование работы радиостанции:
    @Test
    public void currentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);

        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(11);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.setNextRadioStation();

        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        radio.setNextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.setPrevRadioStation();

        int expected = 10;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void ValidNumberRadioStationLim() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.setValidNumberRadioStation(10);

        int expected = 10;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void ValidNumberRadioStationMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);
        radio.setValidNumberRadioStation(55);

        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void ValidNumberRadioStationMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(2);
        radio.setValidNumberRadioStation(-8);

        int expected = 2;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    // Тестирование работы уровня громкости звука:

    @Test
    public void currentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(69);

        int expected = 69;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void nextVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        radio.setNextVolume();

        int expected = 7;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.setNextVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void prevVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.setPrevVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void prevVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-6);
        radio.setPrevVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}
