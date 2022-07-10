package semonster2;

public class Vending_machineTest {
  @Test
  public void name_init(int i) {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }
}
