package semonster2;

public class Vending_machineTest {
  @Test
  public void name_init(int i) {
    Vending_machine calculate = new Vending_machine();
    String expected = "";
    assertEquals(expected, calculate.sum(2, 3));
  }
}
