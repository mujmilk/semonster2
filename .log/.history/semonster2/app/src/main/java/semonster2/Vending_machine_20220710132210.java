package semonster2;

import java.util.Random;
import java.util.Arrays;

public class Vending_machine {
  public Beverage[] beverage;

  public static String name_init(int i) {

    // Random rand2 = new Random();
    String beverage_name[] = { "cola", "water", "monster", "ドデカミン", "氷結", "キレートレモン", "マッチ", "ジンジャエール", "ソルティーライチ",
        "いろはす",
        "ファンタ(レモン)", "鶴瓶麦茶", "午後の紅茶(ストレート)", "午後の紅茶(レモン)", "午後の紅茶(ミルク)", "午後の紅茶(無糖)", "梅よろし", "カフェラテ", "コーヒー",
        "グリーンだから" ,"a"};
    String name_val[] = { "一味", "七味", "カレー", "ラムネ", "七色", "ゲソ", "水晶", "魚介", "豚骨", "味噌", "ソルト", "キタサン", "ダイワ",
        "ミッキー", "サトノ", "塩辛", "ドロリ濃厚", "センチュリー", "アクマ", "パサパサ" ,"a"};

    return name_val[i].concat(beverage_name[i]);
  }

  public Beverage[] drink_init() {
    Random rand = new Random();
    Beverage[] beverages = new Beverage[20];

    // int beverageNum = rand.nextInt(20);
    // System.out.println(beverageNum);
    // 飲み物の初期化
    for (int i = 0; i < 20; i++) {
      beverages[i] = new Beverage((rand.nextInt(20) + 1) * 10, name_init(i), rand.nextInt(20), i);
      // beverages[i].print();
    }
    return beverages;
  }

  Vending_machine() {
    this.beverage = drink_init();
  }

  public void printAll() {
    // int cnt = beverage.length;
    int i = 0;

    while (beverage[i] != null) {
      beverage[i].print();
      i++;
      // System.out.println(i);
    }
  }

}
