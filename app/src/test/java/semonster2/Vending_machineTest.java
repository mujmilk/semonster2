package semonster2;

import org.junit.Test;
import static org.junit.Assert.*;

public class Vending_machineTest {
  @Test
  public void testbuy() {
    Vending_machine vend = new Vending_machine();
    String[] expected = new String[2];

    expected[0] = "False:N:300";
    expected[1] = "False:N";
    assertArrayEquals(expected, Vending_machine.buy(0, 300, vend)); // 在庫がない時

    expected[0] = "True:コーラ:0";
    expected[1] = "False:N";
    assertArrayEquals(expected, Vending_machine.buy(2, 300, vend)); // 買ったが外れたとき

    expected[0] = "False:N:200";
    expected[1] = "False:N";
    assertArrayEquals(expected, Vending_machine.buy(2, 200, vend)); // お金が足りないとき

    expected[0] = "False:N:200";
    expected[1] = "False:N";
    assertArrayEquals(expected, Vending_machine.buy(4, 200, vend)); // 存在しない商品番号が入力されたとき

    expected[0] = "False:N:200";
    expected[1] = "False:N";
    assertArrayEquals(expected, Vending_machine.buy(-1, 200, vend)); // 存在しない商品番号が入力されたとき

  }

  @Test
  public void testroulette() {
    Vending_machine vend = new Vending_machine();

    String expected = "False:N";
    assertEquals(expected, Vending_machine.roulette(0, vend)); // 外れたとき

    expected = "True:コーラ";
    assertEquals(expected, Vending_machine.roulette(1, vend)); // 当たったとき
  }

}
