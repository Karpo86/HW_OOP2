public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int setToMaxStation() {
        this.currentStation =9;
        return 0;
    }

    public int setToMinStation() {
        this.currentStation = 0;
        return 0;
    }


    // Работа с радиостанциями:

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    } //Устанавливаем конкретную станцию

    public void nextTransferStation(int currentStation) {
        if (currentStation == 9) {
            currentStation = setToMinStation();
            return;
        }
        currentStation++;

        this.currentStation = currentStation;

    } //Переключаем на +1 станцию

    public void prevCurrentStation(int currentStation) {
        if (currentStation == 0) {
            currentStation = setToMaxStation();
            return;
        }
        currentStation--;

        this.currentStation = currentStation;
    } //Переключаем на -1 станцию


    // Работа с уровнем громкости звука:

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    } //Устанавливаем ур-нь звука

    public void increaseVolume(int currentVolume) {
        if (currentVolume < 100) {
            currentVolume++;
        }
        if (currentVolume > 100) {
            currentVolume = 100;
        }
        this.currentVolume = currentVolume;
    } //Прибавляем уровень звука

    public void decreaseVolume(int currentVolume) {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    } //Уменьшаем уровень звука



}