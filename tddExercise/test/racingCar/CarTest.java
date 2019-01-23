package racingCar;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car rc = null;
    int fowarddRandomVal = 5;
    int stopRandomVal = 2;
    int goOnceVal = 1;

    @Before
    public void setUp() throws Exception {
        rc = new Car("testCar");
    }

    @After
    public void tearDown() throws Exception {
        rc = null;
    }


    @Test
    public void 입력받은_자동차_이름_수만큼_car_객체를_생성하는지_확인() {
        String carsName = "car01,car02,car03";
        int gameNum = 2;

        RacingGame racingGame = new RacingGame(carsName,2);
        assertEquals(carsName.split(",").length , racingGame.carList.size());
    }

    @Test
    public void 입력받은_차_이름으로_car_객체를_생성하는지_확인() {
        String carsName = "car01,car02,car03";
        int numberOfSingleGame = 3;

        RacingGame racingGame = new RacingGame(carsName,numberOfSingleGame);

        String[] carNames = carsName.split(",");

        for(int i = 0; i < carNames.length; i++){
            assertEquals(carNames[i],racingGame.carList.get(i).getName());
        }
    }

    @Test
    public void 입력한_횟수만큼_게임진행회차정보를_가지는지_확인() {
        int numberOfSingleGame = 3;

        String carsName = "car01,car02,car03";
        RacingGame racingGame = new RacingGame(carsName,numberOfSingleGame);

        assertEquals(numberOfSingleGame,racingGame.getNumOfSingleGame());
    }


//TODO 주어진_게임_회차만큼_진행하는지_확인
    @Test
    @Ignore
    public void 주어진_게임_회차만큼_진행하는지_확인() {

        int numberOfSingleGame = 3;

        assertEquals(numberOfSingleGame,3);

    }

    @Test
    public void testDoGame() {
        int numberOfSingleGame = 3;

        String carsName = "car01,car02,car03";
        RacingGame racingGame = new RacingGame(carsName,numberOfSingleGame);

        racingGame.doGame();

    }

    @Test
    public void testDoSingleGame() {
        int numberOfSingleGame = 3;

        String carsName = "car01,car02,car03";
        RacingGame racingGame = new RacingGame(carsName,numberOfSingleGame);

        racingGame.doSingleGame();

    }

    @Test
    public void 전진조건값이_4이상일때_전진값이_맞게_주어지는지_확인() {
        int randomNum  = 4;
        int expectedGoCarVal = 1;

        assertEquals(expectedGoCarVal,rc.calForwardCoord(randomNum));

    }

    @Test
    public void 전진조건값이_4미만일때_전진값이_맞게_주어지는지_확인() {
        int randomNum  = 3;
        int expectedGoCarVal = 0;

        assertEquals(expectedGoCarVal,rc.calForwardCoord(randomNum));
    }

    @Test
    public void 전진값이_주어졌을떄_자동차의_현재_위치값이_1만큼_변경됨() {
        int initialCoord = rc.getCurrentCoord();

        rc.goCar(fowarddRandomVal);
        int firstCurrentCoord = rc.getCurrentCoord();

        assertEquals(initialCoord + goOnceVal, firstCurrentCoord);

        rc.goCar(fowarddRandomVal);
        int secondCurrentCoord = rc.getCurrentCoord();

        assertEquals(firstCurrentCoord + goOnceVal,secondCurrentCoord);
    }

    @Test
    public void 멈춤값이_주어졌을떄_자동차의_현재_위치값이_변경되지_않음() {
        int initialCoord = rc.getCurrentCoord();

        rc.goCar(stopRandomVal);
        int firstCurrentCoord = rc.getCurrentCoord();

        assertEquals(initialCoord + 0, firstCurrentCoord);

        rc.goCar(stopRandomVal);
        int secondCurrentCoord = rc.getCurrentCoord();

        assertEquals(firstCurrentCoord + 0, secondCurrentCoord);
    }

}