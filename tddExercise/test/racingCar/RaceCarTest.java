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
        RacingGame racingGame = new RacingGame(3);
        assertEquals(inputCarNum, racingGame.rc.size());
    }
}