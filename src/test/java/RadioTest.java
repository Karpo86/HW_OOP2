import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    void shouldChangeOnZeroStationIfCurrentIsNine() {
        Radio radio = new Radio();
        int currentRadioStation = 9;
        radio.setCurrentStation(currentRadioStation);
        radio.next();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldChangeOnNineStationIfCurrentIsZero() {
        Radio radio = new Radio();
        int currentStation = 0;
        radio.setCurrentStation(currentStation);
        radio.prev();
        int expected = 9;
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldChangeOnPreviousRadioStation() {
        Radio radio = new Radio();
        int currentStation = 1;
        radio.setCurrentStation(currentStation);
        radio.prev();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldChangeOnNextRadioStation() {
        Radio radio = new Radio();
        int currentStation = 8;
        radio.setCurrentStation(currentStation);
        radio.next();
        int expected = 9;
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentRadioStationBackToZero() {
        Radio radio = new Radio();
        int currentStation = 10;
        radio.setCurrentStation(currentStation);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentRadioStation() {
        Radio radio = new Radio();
        int currentStation = -1;
        radio.setCurrentStation(currentStation);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldNotSetVolumeOverMax() {
        Radio radio = new Radio();
        int volume = 101;
        radio.setCurrentVolume(volume);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldNotSetVolumeUnderMin() {
        Radio radio = new Radio();
        int volume = -1;
        radio.setCurrentVolume(volume);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        int volume = 8;
        radio.setCurrentVolume(volume);
        radio.increaseVolume();
        int expected = 9;
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void DecreaseVolume() {
        Radio radio = new Radio();
        int volume = 7;
        radio.setCurrentVolume(volume);
        radio.DecreaseVolume();
        int expected = 6;
        Assertions.assertEquals(expected, radio.getCurrentVolume());

    }

    @Test
    void shouldNotIncreaseIfVolumeIsMax() {
        Radio radio = new Radio();
        int volume = 100;
        radio.setCurrentVolume(volume);
        radio.increaseVolume();
        int expected = 100;
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldNotDecreaseIfVolumeIsMin() {
        Radio radio = new Radio();
        int volume=0;
        radio.setCurrentVolume(volume);
        radio.DecreaseVolume();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

}