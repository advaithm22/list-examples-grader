import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class TestListExamples {
  @Test
  public void testMergeLists(){
    List<String> l1 = new ArrayList<String>();
    List<String> l2 = new ArrayList<String>();
    l1.add("a");
    l1.add("b");
    l1.add("c");
    l2.add("c");
    l2.add("d");
    l2.add("e");
    List<String> exp = new ArrayList<String>();
    exp.add("a");
    exp.add("b");
    exp.add("c");
    exp.add("c");
    exp.add("d");
    exp.add("e");
    List<String> actual = ListExamples.merge(l1, l2);
  }

  /*@Test
  public void testStringChecker(){
    List<String> l1 = new ArrayList<String>();
    l1.add("1");
    l1.add("2");
    l1.add("3");
    l1.add("4");
    List<String> expected = new ArrayList<String>();
    expected.add("1");
    expected.add("2");
    expected.add("3");
    StringChecker sc;
    List<String> actual = ListExamples.filter(l1, sc);
    assertEquals(expected, actual);
  }*/ 
}
