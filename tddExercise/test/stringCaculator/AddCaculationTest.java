package stringCaculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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

    String notExistinput = "::";

    ac.validateDelimeterFormat(notExistinput);
  }

  @Test(expected = java.lang.RuntimeException.class)
  public void 유효성_숫자가_아닌_문자면_RuntimeException을_던지는지_확인() {

    String notDigit = "a";

    ac.validateDelimeterFormat(notDigit);
  }
}