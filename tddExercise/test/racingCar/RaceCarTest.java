package racingCar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RaceCarTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void 입력받은_차_수만큼_car_객체를_생성하는지_확인() {
        int inputCarNum = 3;
        RacingGame racingGame = new RacingGame(inputCarNum);
        assertEquals(inputCarNum, racingGame.rc.size());
    }

    @Test
    public void 전진값을_주어졌을떄_자동차의_현재_위치값이_변경됨() {
        //  -  goCar(3) -> car.coord =+ 3
        int forwadNum = 1;
        int currentCoord = 3;

        RaceCar rc = new RaceCar(currentCoord);

        rc.goCar(forwadNum);
        assertEquals(forwadNum+currentCoord, rc.getCurrentCoord());
    }
}