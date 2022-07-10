package semonster2;

import org.junit.Test;
import static org.junit.Assert.*;

public class Vending_machineTest {
  @Test
  public void testbuy() {
    Vending_machine vend = new Vending_machine(3);
    String[] expected = new String[2];

    expected[0] = "False:N:300";
    expected[1] = "False:N";
    String[] actual = vend.buy(0, 300);
    assertArrayEquals(expected, actual); // 在庫がない時

    expected[0] = "True:コーラ:0";
    expected[1] = "False:N";
    assertArrayEquals(expected, vend.buy(2, 300)); // 買ったが外れたとき

    expected[0] = "False:N:200";
    expected[1] = "False:N";
    assertArrayEquals(expected, vend.buy(2, 200)); // お金が足りないとき

    expected[0] = "False:N:200";
    expected[1] = "False:N";
    assertArrayEquals(expected, vend.buy(4, 200)); // 存在しない商品番号が入力されたとき

    expected[0] = "False:N:200";
    expected[1] = "False:N";
    assertArrayEquals(expected, vend.buy(-1, 200)); // 存在しない商品番号が入力されたとき

  }

  @Test
  public void testroulette() {
    Vending_machine vend = new Vending_machine(3);

    String expected = "False:N";
    assertEquals(expected, vend.roulette(0)); // 外れたとき

    expected = "True:コーラ";
    assertEquals(expected, vend.roulette(1)); // 当たったとき
  }

}
