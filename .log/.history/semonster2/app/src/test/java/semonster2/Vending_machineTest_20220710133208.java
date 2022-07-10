package semonster2;

public class Vending_machineTest {
  @Test
  public void Testname_init(int i) {
    Vending_machine calculate = new Vending_machine();
    String expected = "一味cola";
    assertEquals(expected, calculate.name_init(2, 3));
  }
}
