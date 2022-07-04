/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package semonster2;

import java.util.Random;

public class App {

  public static void init() {
    String beverage_name[] = { "cola", "water", "monster", "ドデカミン", "氷結", "キレートレモン", "マッチ", "ジンジャエール", "ソルティーライチ",
        "いろはす",
        "ファンタ(レモン)", "鶴瓶麦茶", "午後の紅茶(ストレート)", "午後の紅茶(レモン)", "午後の紅茶(ミルク)", "午後の紅茶(無糖)", "梅よろし", "カフェラテ", "コーヒー",
        "グリーンだから" };
    Random rand = new Random();
    Beverage[] beverages = new Beverage[20];

    int beverageNum = rand.nextInt(20);
    System.out.println(beverageNum);
    for (int i = 0; i < beverageNum; ++i) {
      beverages[i] = new Beverage((rand.nextInt(20) + 1) * 10, beverage_name[i].concat();, rand.nextInt(20));
      beverages[i].print();
    }
  }

  public static void main(String[] args) {
    init();

  }
}
