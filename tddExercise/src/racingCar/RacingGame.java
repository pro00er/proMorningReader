package racingCar;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    List<RaceCar> rc;

    public RacingGame(int carNum) {
        rc = new ArrayList<>();
//      TODO  생성과 동시에 초기화 java8 사용해서
        for (int i = 0; i < carNum; i++) {
            rc.add(new RaceCar());
        }
    }
}
