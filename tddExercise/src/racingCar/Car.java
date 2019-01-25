package racingCar;

/**
 * 자동차 경주에 참여하는 자동차
 */
public class Car {

    private String name;
    private int currentCoord;

    public Car(String name) {
        this.name = name;
        this.currentCoord = 0;
    }

    public Car(int currentCoord) {
        this.currentCoord = currentCoord;
    }

    String getName() {
        return name;
    }

    int getCurrentCoord() {
        return currentCoord;
    }


    public void goCar() {
        this.currentCoord += calForwardCoord(getRandomVal());
    }

    void goCar(int randomVal) {
        this.currentCoord += calForwardCoord(randomVal);
    }

    private int getRandomVal() {
        return (int)(Math.random() * 8 + 1);
    }

    int calForwardCoord(int randomVal) {

        return randomVal >=4? 1:0;
    }

//    // TODO test용 생성
//    public void setCurrentCoord(int currentCoord) {
//        this.currentCoord = currentCoord;
//    }
}
