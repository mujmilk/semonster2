package semonster2;

public class Vending_machineTest {
  @Test
  public void testbuy() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testroulette() {
    Calculate calculate = new Calculate();
    double expected = 2.5;
    assertEquals(expected, calculate.ave(2, 3), 0.00001);
  }

}
