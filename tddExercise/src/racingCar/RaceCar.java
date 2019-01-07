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


//    public int inputCarNum(int inputCarNum) {
////        List<Car> carList = new ArrayList<>();
////        for(int i = 0 ; i< inputCarNum ; i++){
////            ((ArrayList) carList).add(new Car());
////        }
////        return ((ArrayList) carList).size()
//////        return 0;
//    }
}
