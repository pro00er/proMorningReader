package racingCar;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    List<Car> carList;
    int numOfSingleGame;

////+ winner
////+ setupGame()
//+ doTurn() 해당 회차 게임 진행
//+ doGame()
//+ printResult()
//+ turnResult()

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
        for(int i = 0; i <numOfSingleGame; i++){
            doSingleGame();
        }
        printResult();
    }

    private void printResult() {
    }

    private void doSingleGame() {
    }


    private String[] splitCarsName(String carsName) {
        String nameDelim = ",";
        return carsName.split(nameDelim);
    }
}
