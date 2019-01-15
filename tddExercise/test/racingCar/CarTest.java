package racingCar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car rc = null;

    @Before
    public void setUp() throws Exception {
        rc = new Car("testCar");
    }

    @After
    public void tearDown() throws Exception {
        rc = null;
    }


    @Test
    public void 입력받은_차_이름만큼_car_객체를_생성하는지_확인() {
        String carsName = "car01,car02,car03";

        RacingGame racingGame = new RacingGame(carsName);
        assertEquals(carsName.split(",").length , racingGame.carList.size());
    }

    @Test
    public void 입력받은_차_이름으로_car_객체를_생성하는지_확인() {
        String carsName = "car01,car02,car03";
        RacingGame racingGame = new RacingGame(carsName);

        String[] carNames = carsName.split("");

        for(int i = 0; i < carNames.length; i++){
            assertEquals(carNames[i],racingGame.carList.get(i).getName());
        }
    }

    @Test
    public void 주어진_횟수만큼_게임을_진행하는지_확인() {
        int numberOfSingleGame = 3;

        String carsName = "car01,car02,car03";
        RacingGame racingGame = new RacingGame(carsName,numberOfSingleGame);

        assertEquals(numberOfSingleGame,racingGame.getNumOfSingleGame());


    }

    @Test
    public void 전진값을_주어졌을떄_자동차의_현재_위치값이_변경됨() {
        int firstForwardNum = 1;
        int secondForwardNum = 3;

        rc.goCar(firstForwardNum);
        assertEquals(firstForwardNum, rc.getCurrentCoord());

        rc.goCar(secondForwardNum);
        assertEquals(firstForwardNum+secondForwardNum, rc.getCurrentCoord());
    }

    @Test
    public void 멈춤값이_주어졌을떄_자동차의_현재_위치값이_변경되지_않음() {
        int firstForwardNum = 0;
        int secondForwardNum = 0;

        rc.goCar(firstForwardNum);
        assertEquals(firstForwardNum, rc.getCurrentCoord());

        rc.goCar(secondForwardNum);
        assertEquals(firstForwardNum+secondForwardNum, rc.getCurrentCoord());
    }

    @Test
    public void 전진조건값이_4이상일때_전진값이_맞게_주어지는지_확인() {
        int randomNum  = 4;
        int expectedGoCarVal = 1;

        assertEquals(expectedGoCarVal,rc.getForwardCoord(randomNum));

    }

    @Test
    public void 전진조건값이_4미만일때_전진값이_맞게_주어지는지_확인() {
        int randomNum  = 3;
        int expectedGoCarVal = 0;

        assertEquals(expectedGoCarVal,rc.getForwardCoord(randomNum));
    }
}