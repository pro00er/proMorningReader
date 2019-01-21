package racingCar;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    List<Car> carList;
    int numOfSingleGame;

    public RacingGame(String carsName, int numOfSingleGame) {

        this.numOfSingleGame = numOfSingleGame;

        carList = new ArrayList<>();
        for(String carName : splitCarsName(carsName)){
            carList.add(new Car(carName));
        }
    }

    public int getNumOfSingleGame() {
        return numOfSingleGame;
    }





    private String[] splitCarsName(String carsName) {
        String nameDelim = ",";
        return carsName.split(nameDelim);
    }
}
