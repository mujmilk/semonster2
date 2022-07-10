package semonster2;

import java.util.Random;
//import java.util.Arrays;

public class Vending_machine {
  public Beverage[] beverage;

  Vending_machine() {
    this.beverage = drink_init();
  }

  Vending_machine(int test) { // test用
    Beverage[] beverages = new Beverage[3];

    beverages[0] = new Beverage(100, "いろはす", 20, 0);
    beverages[1] = new Beverage(200, "梅よろし", 20, 1);
    beverages[2] = new Beverage(300, "コーラ", 20, 2);
    this.beverage = beverages;
  }

  public String[] buy(int n, int money) {
    String[] result = new String[2];
    int change;

    if (this.beverage.length < n || n < 0) {
      change = money;
      System.out.println("そんな商品番号はない");
      result[0] = "False" + ":" + "N" + ":" + String.valueOf(change);
      result[1] = "False" + ":" + "N";
    } else if (this.beverage[n].price > money || this.beverage[n].stock == 0) {
      // 買えない
      change = money;
      result[0] = "False" + ":" + "N" + ":" + String.valueOf(change);
      result[1] = "False" + ":" + "N";
    } else {
      this.beverage[n].stock--;// 在庫を減らす
      change = money - this.beverage[n].price;// moneyからnの値段文ひいておつり
      result[1] = roulette(n);
      result[0] = "True" + ":" + this.beverage[n].name + ":" + String.valueOf(change);
    }
    return result;
  }

  public String roulette(int n) {

    String result;
    int drink_num = 0;
    int max_stock = 0;

    if (n % 10 == 1) {
      System.out.println("7777");
      System.out.println("当たり");
      for (int i = 0; i < this.beverage.length; i++) {
        if (max_stock < this.beverage[i].stock) {
          max_stock = this.beverage[i].stock;
          drink_num = i;
        }
      }

      this.beverage[drink_num].stock--;// 在庫を減らす
      result = "True" + ":" + this.beverage[drink_num].name;

      // drink_numの在庫を減らす処理
    } else {
      System.out.println("はずれ～～～～");
      result = "False" + ":" + "N";
    }

    return result;
  }

  public static String name_init(int i) {

    // Random rand2 = new Random();
    String beverage_name[] = { "cola", "water", "monster", "ドデカミン", "氷結", "キレートレモン", "マッチ", "ジンジャエール", "ソルティーライチ",
        "いろはす",
        "ファンタ(レモン)", "鶴瓶麦茶", "午後の紅茶(ストレート)", "午後の紅茶(レモン)", "午後の紅茶(ミルク)", "午後の紅茶(無糖)", "梅よろし", "カフェラテ", "コーヒー",
        "グリーンだから", };
    String name_val[] = { "一味", "七味", "カレー", "ラムネ", "七色", "ゲソ", "水晶", "魚介", "豚骨", "味噌", "ソルト", "キタサン", "ダイワ",
        "ミッキー", "サトノ", "塩辛", "ドロリ濃厚", "センチュリー", "アクマ", "パサパサ", };

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

  public void printAll() {
    int cnt = beverage.length;
    int i = 0;

    while (i < cnt) {
      beverage[i].print();
      i++;
      // System.out.println(i);
    }
  }

}
