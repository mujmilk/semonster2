/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package semonster2;

import java.util.Random;

public class App {
  Beverage beverage = [];



  public void init() {

    Random rand = new Random();
    int beverageNum = rand.nextInt(20);
    for (int i = 0; i < beverageNum; ++i) {
      
    }
  }

  public static void main(String[] args) {
    init();
  }
}
