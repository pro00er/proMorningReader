package racingCar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 자동차 경주 게임
 */
public class RacingGame {

    List<Car> carList;
    private int turn;
    private List<String> winnersName;  // TODO - car 객체가 더 나은지, 아니면 이름만?

    public RacingGame(String carsName, int turn) {

        this.turn = turn;

        carList = new ArrayList<>();
        for (String carName : splitCarsName(carsName)) {
            carList.add(new Car(carName));
        }
    }

    int getTurn() {
        return turn;
    }

    public void doGame() {

        String carNamee  = scanCarNames();
        int turn = scanTurn();
//        경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).
//        시도할 회수는 몇회인가요?

        for (int i = 0; i < turn; i++) {
            doTurnGame();
        }

        this.winnersName = calWinner();  //TODO - Is it better to use calWinner Void type?

        printResult();
    }

    private int scanTurn() {
        return 0;
    }

    private String scanCarNames() {
        Scanner scan = new Scanner(System.in);      // 문자 입력을 인자로 Scanner 생성
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");

        System.out.println("메시지를 입력하세요:");

        return scan.nextLine();
    }

    void doTurnGame() {
        for (int i = 0; i < carList.size(); i++) {
            carList.get(i).goCar();
        }

        printTurnResult();
    }

    List<String> calWinner() {

        int maxCoord = 0;
        List<String> winnerNames = new ArrayList<>();

        for (Car car : carList) {
            if (car.getCurrentCoord() > maxCoord) {
                maxCoord = car.getCurrentCoord();

                winnerNames.clear(); // TODO test- vs new ArrayList() Is element size same compare to before ?
                winnerNames.add(car.getName());

            } else if (car.getCurrentCoord() == maxCoord) {
                winnerNames.add(car.getName());
            }
        }

        return winnerNames;
    }

    private void printResult() {
        System.out.println(String.join(", ", winnersName) + "가 최종우승했습니다.");
    }

    private void printTurnResult() {
        for (int i = 0; i < carList.size(); i++) {
            System.out.print(carList.get(i).getName() + " : ");
            printCurrentCoordLine(carList.get(i).getCurrentCoord());
            System.out.println();
        }
        System.out.println(System.lineSeparator());
    }

    private void printCurrentCoordLine(int currentCoord) {
        for (int i = 0; i < currentCoord; i++) {
            System.out.print("-");
        }
    }

    private String[] splitCarsName(String carsName) {
        String nameDelim = ",";
        return carsName.split(nameDelim);
    }
}
