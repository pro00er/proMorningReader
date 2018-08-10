package stringCaculator;

import static org.junit.Assert.*;

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
  public void ���ڿ���_��ǥ��_�ݷ���_�����ϴ���() {

    String existinput = "3:2";
    String notExistinput = "3";

//TODO ��ȿ�� �˻��ؼ� exception �����°� �߰�����

    assertTrue(ac.isExistDelimeter(existinput));
    assertFalse(ac.isExistDelimeter(notExistinput));
  }

  @Test(expected = java.lang.RuntimeException.class)
  public void ������_������_����_������_RuntimeException��_��������_Ȯ��() {

    String notExistinput = "1::2";

    ac.validateDelimeterFormat(notExistinput);
  }

  @Test(expected = java.lang.RuntimeException.class)
  public void ��ȿ��_���ڰ�_�ƴ�_���ڸ�_RuntimeException��_��������_Ȯ��() {

    String notDigit = "2:3b";

    ac.validateDelimeterFormat(notDigit);
  }

  @Test(expected = RuntimeException.class)
  public void �����̿���_��_�Ǵ�_������_�Է¹��ڿ���_���_RuntimeException_���ܸ�_throw�ϴ���_Ȯ��() {
    String notDigit = "2:-1";

    ac.validateDelimeterFormat(notDigit);
  }

  @Test(expected = NumberFormatException.class)
  public void �⺻_�����ڹ��ڿ�����_���ڸ�_�����_�Ľ��ϴ���_Ȯ��() {
	  //TODO �׽�Ʈ �и��ؾ���.
	    String[] inputs = {"3","4","3"};
    assertTrue(ac.isBasicParseNumber(inputs));
    
    String[] notDigit = {"a","b","c"};
    ac.isBasicParseNumber(notDigit);
//   TODO testcase ���ڰ� 4���̻��϶� Ȯ��
//TODO ArrayList expected ����ٰ� �ߴ�
//    assertEquals(new ArrayList()),ac.parseDigit(input);
  }

  @Test
  public void ������_�����_�ϴ���_Ȯ��() {
    String[] inputs = {"3","4","3"};
    assertEquals(10,ac.sum(inputs));
  }
}