package semonster2;

import java.util.Random;
import java.util.Arrays;

public class Vending_machine {
  public Beverage[] beverage;

  public static String name_init() {
    // ランダムに名前を生成する
    Random rand2 = new Random();
    String beverage_name[] = { "cola", "water", "monster", "ドデカミン", "氷結", "キレートレモン", "マッチ", "ジンジャエール", "ソルティーライチ",
        "いろはす",
        "ファンタ(レモン)", "鶴瓶麦茶", "午後の紅茶(ストレート)", "午後の紅茶(レモン)", "午後の紅茶(ミルク)", "午後の紅茶(無糖)", "梅よろし", "カフェラテ", "コーヒー",
        "グリーンだから" };
    String name_val[] = { "一味", "七味", "カレー", "ラムネ", "七色", "ゲソ", "水晶", "魚介", "豚骨", "味噌", "ソルト", "キタサン", "ダイワ",
        "ミッキー", "サトノ", "塩辛", "ドロリ濃厚", "センチュリー", "アクマ", "デーモン", "金色", "BB", "デカスギ", "カチコチ", "プヨプヨ", "食塩" };

    return name_val[rand2.nextInt(25)].concat(beverage_name[rand2.nextInt(20)]);
  }

  public Beverage[] drink_init() {
    Random rand = new Random();
    Beverage[] beverages = new Beverage[20];

    int beverageNum = rand.nextInt(20);
    // System.out.println(beverageNum);
    // 飲み物の初期化
    for (int i = 0; i < beverageNum; ++i) {
      beverages[i] = new Beverage((rand.nextInt(20) + 1) * 10, name_init(), rand.nextInt(20), i);
      beverages[i].print();
    }
    return beverages;
  }

  Vending_machine() {
    this.beverage = drink_init();
  }

}
