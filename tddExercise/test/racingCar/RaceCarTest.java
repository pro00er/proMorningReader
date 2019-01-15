package racingCar;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class RaceCarTest {

    RaceCar raceCar;

    @Before
    public void setUp() throws Exception {
        raceCar = new RaceCar();
        raceCar.setCarNames("pobi,crong,honux");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void 각_자동차에_이름을_부여할_수_있다() {
        Assert.assertArrayEquals(new String[]{"pobi","crong","honux"}, raceCar.getCarNames());
    }

    @Test
    public void 자동차_수만큼_랜덤값을_만듦() {
        List<Integer> numbers = raceCar.getGoNumbers();
        Assert.assertEquals(raceCar.getCarNames().length, numbers.size());
    }


    /*
    - [ ] 전진값을 주어졌을떄 자동차의 현재 위치값이 변경됨
      -  goCar(3) -> car.coord =+ 3
    - [ ] 멈춤값을 주어졌을떄 자동차의 현재 위치값이 변경되지 않음
      -  goCar(0)? stopCar()?
    - [ ] 전진조건값이 4이상일때 전진값이 맞게 주어지는지 확인
      -  int random = 4 -> goCarValue = 1
    - 전진조건값이 4미만일때 전진값이 맞게 주어지는지 확인
      -  int random = 3 -> goCarValue = 0
    - [x] 입력받은 차 수만큼 car 객체를 생성하는지 확인
    - //TODO 생성된 차가 각 회차마다 전진조건값을 전달받는지 확인
      - 전달받는지 확인이 이상하다 그건 우리가 확인못하는뎅
    - ~자동차 수만큼 랜덤값을 만듦~
      - 랜덤값은 테스트할 수 없음
    - ~랜덤값이 0~9 사이인지 범위확인~
      - 우린 랜덤값 확인 못함
      - 테스트케이스를 만들려면 언제나 일정한 값이 나와야 옳은 테스트케이스인지 확인가능
      - 예를 들어 잘못만들어서 2만 계속 나와도 이 테스트케이스는 통과가 되어버림
     */
}