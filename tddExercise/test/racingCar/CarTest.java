package racingCar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private Car rc = null;

    private int fowarddRandomVal = 5;
    private int stopRandomVal = 2;
    private int goOnceVal = 1;

    @Before
    public void setUp() {
        rc = new Car("testCar");
    }

    @After
    public void tearDown() {
        rc = null;
    }

    @Test
    public void 전진조건값이_4이상일때_전진값이_맞게_주어지는지_확인() {
        int randomNum = 4;
        int expectedGoCarVal = 1;

        assertEquals(expectedGoCarVal, rc.calForwardCoord(randomNum));

    }

    @Test
    public void 전진조건값이_4미만일때_전진값이_맞게_주어지는지_확인() {
        int randomNum = 3;
        int expectedGoCarVal = 0;

        assertEquals(expectedGoCarVal, rc.calForwardCoord(randomNum));
    }

    @Test
    public void 전진값이_주어졌을떄_자동차의_현재_위치값이_1만큼_변경됨() {
        int initialCoord = rc.getCurrentCoord();

        rc.goCar(fowarddRandomVal);
        int firstCurrentCoord = rc.getCurrentCoord();

        assertEquals(initialCoord + goOnceVal, firstCurrentCoord);

        rc.goCar(fowarddRandomVal);
        int secondCurrentCoord = rc.getCurrentCoord();

        assertEquals(firstCurrentCoord + goOnceVal, secondCurrentCoord);
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