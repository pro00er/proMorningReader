package stringCaculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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

//TODO 유효성 검사해서 exception 던지는걸 추가하자

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
  public void 숫자를_제대로_파싱하는지_확인() {
    String input = "3:4";
//   TODO testcase 숫자가 4개이상일때 확인
//TODO ArrayList expected 만들다가 중단
//    assertEquals(new ArrayList()),ac.parseDigit(input);

  }

  @Test
  public void 덧셈을_제대로_하는지_확인() {
    String input = "3:4:3";
//TODO 구현하세요
//    TODO 책에서는 숫자제대로파싱하지 전에 이거먼저 구현했음
    assertEquals(10,ac.sum(input));
  }
}