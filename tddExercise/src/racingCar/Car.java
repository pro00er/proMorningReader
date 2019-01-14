package racingCar;

public class Car {

    String name;
    int currentCoord;

    public Car(String name) {
        this.name = name;
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
