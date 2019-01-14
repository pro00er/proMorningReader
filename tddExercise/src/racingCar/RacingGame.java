package racingCar;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    List<Car> carList;

    public RacingGame(String carsName) {
        carList = new ArrayList<>();

        for(String carName : splitCarsName(carsName)){
            carList.add(new Car(carName));
        }
    }

    private String[] splitCarsName(String carsName) {
        String nameDelim = ",";
        return carsName.split(nameDelim);
    }
}
