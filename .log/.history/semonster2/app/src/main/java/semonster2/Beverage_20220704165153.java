package semonster2;

public class Beverage {

  public int price;
  public String name;
  public int stock;


  public String name_val[]={"一味","七味","カレー","ラムネ","七色","ゲソ","水晶","魚介","豚骨","味噌","ソルト","キタサン","ダイワ","ミッキー","サトノ","塩辛","ドロリ濃厚","センチュリー","","","","","","","",""};

  Beverage(int p, String n, int s) {
    this.price = p;
    this.name = n;
    this.stock = s;
  }

  public void print() {
    System.out.println(name + ": 価格: " + price + "円 在庫: " + stock + "個");
  }
}
