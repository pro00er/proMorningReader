package racingCar;

public class Car {

    int currentCoord;

    public Car() {
        this.currentCoord = 0;
    }

    public Car(int currentCoord) {
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
