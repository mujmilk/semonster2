/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package semonster2;

import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {
  @Test
  public void appHasAGreeting() {
    User classUnderTest = new User(100, 100);
    assertEquals(
        "=== 所持金 ===\n現金: 100円, 電子マネー: 100円\n=== 購入した商品 ===\n",
        classUnderTest.toString());
  }
}