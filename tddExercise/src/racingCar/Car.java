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

    public String getName() {
        return name;
    }

    public int getCurrentCoord() {
        return currentCoord;
    }


    public void goCar() {
        this.currentCoord += calForwardCoord(getRandomVal());
    }

    //TODO remove this
    public void goCar(int randomVal) {
        this.currentCoord += calForwardCoord(randomVal);
    }

    private int getRandomVal() {
        return (int)(Math.random() * 8 + 1);
    }

    public int calForwardCoord(int randomVal) {

        return randomVal >=4? 1:0;
    }
}
