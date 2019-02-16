package racingCar;

import static org.junit.Assert.*;

import org.junit.Test;

public class RacingGameTest {

	@Test
	public void 전진값을_주어졌을떄_자동차의_현재_위치값이_변경됨() {
		RacingCar racingCar = new RacingCar();
		racingCar.goCar(3);
		assertEquals(3, racingCar.getCoord());
	}

	@Test
	public void 전진조건값이_4이상일때_전진값이_맞게_주어지는지_확인() {
		RacingCar racingCar = new RacingCar();
		assertEquals(1, racingCar.getCarValue(4));
	}

	@Test
	public void 전진조건값이_4미만일때_전진값이_맞게_주어지는지_확인() {
		RacingCar racingCar = new RacingCar();
		assertEquals(0, racingCar.getCarValue(3));
	}

	@Test
	public void 입력받은_차_수만큼_car_객체를_생성하는지_확인() {
		String names[] = new String[] { "pobi", "crong", "honux" };
		RacingGame game = new RacingGame();
		game.setup(names);
		assertEquals(3, game.getCar());
	}

	@Test
	public void 입력받은_차_수만큼_자동차_이름을_넣어준다() {
		String names[] = new String[] { "pobi", "crong" };
		RacingGame game = new RacingGame();
		game.setup(names);
		assertArrayEquals(names, game.getCarNameList());
	}

	@Test
	public void 자동차이름은쉼표를_기준으로구분한다() {
		String inputName = "pobi,crong";
		String names[] = new String[] { "pobi", "crong" };
		RacingGame game = new RacingGame();
		assertArrayEquals(names, game.splitNames(inputName));
	}

	@Test
	public void 자동차한대의좌표표시보이기() {
		RacingCar car = new RacingCar();
		car.goCar(1);
		assertEquals("-", car.getCoordStr());
	}

}
