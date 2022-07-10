package semonster2;

public class Vending_machineTest {
  @Test public void Vending_machine() {
    Vending_machine vending_machine = new Vending_machine();
    String expected = "一味cola";
    assertEquals(expected, vending_machine.beverage[1].name);
  }
}
