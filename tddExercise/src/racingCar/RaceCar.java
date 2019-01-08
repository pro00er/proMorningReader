package racingCar;

public class RaceCar {

    int currentCoord;

    public RaceCar() {
        this.currentCoord = 0;
    }

    public RaceCar(int currentCoord) {
        this.currentCoord = currentCoord;
    }

    public int getCurrentCoord() {
        return currentCoord;
    }

    public void goCar(int forwadNum) {
        this.currentCoord += forwadNum;
    }

    public int getForwardCoord(int randomVal) {

        return randomVal >=4? 1:0;
    }
}
