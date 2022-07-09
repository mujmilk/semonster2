package semonster2;

import org.junit.Test;
import static org.junit.Assert.*;

public class Vending_machineTest {
  @Test
  public void testbuy() {
    Vending_machine vend = new Vending_machine();
    String[] expected = new String[2];
    expected[0] = assertEquals(expected, Vending_machine.buy());
  }

  @Test
  public void testroulette() {
    Vending_machine vend = new Vending_machine();
    String expected = 2.5;
    assertEquals(expected, Vending_machine.roulette());
  }

}
