package racingCar;

import java.util.*;
import java.util.stream.Collectors;

public class RaceCar {

    private List<String> carNames;
    private List<Integer> carLocations;

    public RaceCar(List<String> carNames) {
        this.carNames = carNames;
    }

    public RaceCar() {
        this.carNames = new ArrayList<String>();
        this.carLocations = new ArrayList<Integer>();
    }

    public void setCarNames(String carNames) {
        String[] splitsName = carNames.split(",");
        for (String name : splitsName) {
            this.carNames.add(name);
            this.carLocations.add(1);
        }
    }

    public String[] getCarNames() {
        return null;
    }

    public List<Integer> getGoNumbers() {
        return new Random().ints(carNames.size(), 0, 9).boxed().collect(Collectors.toList());
    }

    public void goSteps(int stepCnt) {
        for (int i = 0; i < stepCnt; i++) {
            List<Integer> stepNumbers = getGoNumbers();
            for (int j = 0; j < stepNumbers.size(); j++) {
                if()
            }
        }
    }
}
