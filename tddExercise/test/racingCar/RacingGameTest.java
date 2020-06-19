package racingCar;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RacingGameTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"car01,car02,car03", 3}});
    }

    private RacingGame racingGame = null;

    private String carsName;
    private int turn;

    public RacingGameTest(String carsName, int turn) {
        this.carsName = carsName;
        this.turn = turn;

    }

    @Before
    public void setUp() {
        racingGame = new RacingGame(carsName, turn);
    }

    @After
    public void tearDown() {
    }


    @Test
    public void 입력받은_자동차_이름_수만큼_car_객체를_생성하는지_확인() {

        assertEquals(carsName.split(",").length, racingGame.carList.size());
    }

    @Test
    public void 입력받은_차_이름으로_car_객체를_생성하는지_확인() {

        String[] carNames = carsName.split(",");

        for (int i = 0; i < carNames.length; i++) {
            assertEquals(carNames[i], racingGame.carList.get(i).getName());
        }
    }

    @Test
    public void 입력한_횟수만큼_게임진행회차정보를_가지는지_확인() {

        assertEquals(turn, racingGame.getTurn());
    }


    @Test
    @Ignore
    public void testDoGame() {

        racingGame.doGame();
    }

    @Test
    @Ignore
    public void testDoSingleGame() {

        racingGame.doTurnGame();
    }

    @Test
    public void 우승자_정보를_맞게_가져오는지_확인_우승자_두명() {
        AddCarsCoord(3, 2, 3);
        List<String> winners = Stream.of(racingGame.carList.get(0).getName(), racingGame.carList.get(2).getName()).collect(Collectors.toList());

        assertEquals(winners, racingGame.calWinner());
    }

    @Test
    public void 우승자_정보를_맞게_가져오는지_확인_우승자_한명() {
        AddCarsCoord(1, 2, 3);
        List<String> winners = Stream.of(racingGame.carList.get(2).getName()).collect(Collectors.toList());

        assertEquals(winners, racingGame.calWinner());
    }

    @Test
    public void 우승자_정보를_맞게_가져오는지_확인_우승자_세명() {
        AddCarsCoord(3, 3, 3);
        List<String> winners = Stream.of(racingGame.carList.get(0).getName(), racingGame.carList.get(1).getName(), racingGame.carList.get(2).getName()).collect(Collectors.toList());

        assertEquals(winners, racingGame.calWinner());
    }

    private void AddCarsCoord(int firstCarCoord, int secondCarCoord, int thirdCarCoord) {

        int randomValForward = 5;

        for (int i = 0; i < firstCarCoord; i++) {
            racingGame.carList.get(0).goCar(randomValForward);
        }

        for (int i = 0; i < secondCarCoord; i++) {
            racingGame.carList.get(1).goCar(randomValForward);
        }

        for (int i = 0; i < thirdCarCoord; i++) {
            racingGame.carList.get(2).goCar(randomValForward);
        }
    }
}