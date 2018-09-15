package stringCaculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddCaculationTest {

	AddCaculation ac = null;

	@Before
	public void setUp() throws Exception {
		ac = new AddCaculation();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void 문자열에_쉼표나_콜론이_존재하는지() {

		String existinput = "3:2";
		String notExistinput = "3";

		// TODO 유효성 검사해서 exception 던지는걸 추가하자

		assertTrue(ac.isExistDelimeter(existinput));
		assertFalse(ac.isExistDelimeter(notExistinput));
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void 구분자_형식이_맞지_않으면_RuntimeException을_던지는지_확인() {

		String notExistinput = "1::2";

		ac.validateDelimeterFormat(notExistinput);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void 유효성_숫자가_아닌_문자면_RuntimeException을_던지는지_확인() {

		String notDigit = "2:3b";

		ac.validateDelimeterFormat(notDigit);
	}

	@Test(expected = RuntimeException.class)
	public void 숫자이외의_값_또는_음수가_입력문자열인_경우_RuntimeException_예외를_throw하는지_확인() {
		String notDigit = "2:-1";

		ac.validateDelimeterFormat(notDigit);
	}

	@Test
	public void 기본_구분자문자열에서_숫자String를_제대로_파싱하는지_확인_정상값() {
		String inputs = "3,4,3";
		String[] inputParseResult = ac.isBasicParseNumber(inputs);
		
		assertArrayEquals(new String[] { "3", "4", "3" }, inputParseResult);
	}

	@Test
	public void 덧셈을_제대로_하는지_확인() {
		String[] inputs = { "3", "4", "3" };
		assertEquals(10, ac.sum(inputs));
	}

	@Test
	public void 입력값에_대한_덧셈계산을_제대로_하는지_확인_인수테스트() {
		String[] inputs = ac.isBasicParseNumber("3,4,5");
		assertEquals(12, ac.sum(inputs));
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void parseValidation_입력문자열이_null일때_RuntimeException을_throw하는지_확인() {
		String[] inputs = null;
		ac.isBasicParseNumber(null);
	}
	
	
	

}