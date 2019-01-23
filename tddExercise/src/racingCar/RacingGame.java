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

    public void doGame(){
        for(int i = 0; i < numOfSingleGame; i++){
            doSingleGame();
        }
        printResult();
    }

    void doSingleGame() {
        for(int i = 0; i < carList.size(); i++){
            carList.get(i).goCar();
        }
        printTurnResult();
    }

    private void printTurnResult() {
        for(int i = 0; i < carList.size(); i++){
            System.out.print(carList.get(i).getName() + " : ");
            printCurrentCoordLine(carList.get(i).getCurrentCoord());
            System.out.println("");
        }
        System.out.println("");
    }

    private void printCurrentCoordLine(int currentCoord) {
        for(int i = 0; i < currentCoord; i++) {
            System.out.print("-");
        }
    }

    private void printResult() {
    }


    private String[] splitCarsName(String carsName) {
        String nameDelim = ",";
        return carsName.split(nameDelim);
    }
}
