package racingCar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


    //TODO 이름 입력받은 만큼으로 변경
    @Test
    public void 입력받은_차_수만큼_car_객체를_생성하는지_확인() {
        int inputCarNum = 3; //inputCar 입력함수로 변경?

        RacingGame racingGame = new RacingGame(inputCarNum);
        assertEquals(inputCarNum, racingGame.rc.size());
    }

    @Test
    public void 전진값을_주어졌을떄_자동차의_현재_위치값이_변경됨() {
        int forwardNum = 1;
        int currentCoord = 3;

        Car rc = new Car(currentCoord);

        rc.goCar(forwardNum);
        assertEquals(forwardNum+currentCoord, rc.getCurrentCoord());
    }

    @Test
    public void 멈춤값이_주어졌을떄_자동차의_현재_위치값이_변경되지_않음() {
        int forwardNum = 0;
        int currentCoord = 3;

        Car rc = new Car(currentCoord);

        rc.goCar(forwardNum);
        assertEquals(forwardNum+currentCoord, rc.getCurrentCoord());

    }

    @Test
    public void 전진조건값이_4이상일때_전진값이_맞게_주어지는지_확인() {
        int randomNum  = 4;
        int expectedGoCarVal = 1;

        Car rc = new Car();

        assertEquals(expectedGoCarVal,rc.getForwardCoord(randomNum));

    }

    @Test
    public void 전진조건값이_4미만일때_전진값이_맞게_주어지는지_확인() {
        int randomNum  = 3;
        int expectedGoCarVal = 0;

        Car rc = new Car();

        assertEquals(expectedGoCarVal,rc.getForwardCoord(randomNum));
    }
}