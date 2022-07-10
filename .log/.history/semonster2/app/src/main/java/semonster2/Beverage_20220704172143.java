package semonster2;
import java.util.Random;
public class Beverage {

  public int price;
  public String name;
  public int stock;



  Beverage(int p, String n, int s) {
    this.price = p;
    this.name = n;
    this.stock = s;
  }

  public void print() {
    System.out.println(name + ": 価格: " + price + "円 在庫: " + stock + "個");
  }

  public String name_init() {
    Random rand = new Random();
    String beverage_name[] = { "cola", "water", "monster", "ドデカミン", "氷結", "キレートレモン", "マッチ", "ジンジャエール", "ソルティーライチ",
        "いろはす",
        "ファンタ(レモン)", "鶴瓶麦茶", "午後の紅茶(ストレート)", "午後の紅茶(レモン)", "午後の紅茶(ミルク)", "午後の紅茶(無糖)", "梅よろし", "カフェラテ", "コーヒー",
        "グリーンだから" };
    String name_val[] = { "一味", "七味", "カレー", "ラムネ", "七色", "ゲソ", "水晶", "魚介", "豚骨", "味噌", "ソルト", "キタサン", "ダイワ",
        "ミッキー", "サトノ", "塩辛", "ドロリ濃厚", "センチュリー", "アクマ", "デーモン", "金色", "BB", "デカスギ", "カチコチ", "プヨプヨ", "食塩" };

    return name_val[rand.nextInt(20)].concat(beverage_name[rand.nextInt(20)]);
  }
}
