package semonster2;

import java.util.ArrayList;

public class User {
  public int e_money;
  public int money;
  public ArrayList<String> purchased_items = new ArrayList<>();

  User(int m, int e) {
    this.money = m;
    this.e_money = e;
  }

  public void buy(String str, int charge, int use) {
    purchased_items.add(str);
    if (use == 0) {
      this.money = charge;
    } else {
      this.e_money = charge;
    }
  }

  public void buy(String str) {
    purchased_items.add(str);
  }

  public void print_money() {
    System.out.println("現金: " + this.money + "円, 電子マネー: " + this.e_money + "円");
  }

  public String toString() {
    String s = "=== 所持金 ===\n";
    s += "現金: " + this.money + "円, 電子マネー: " + this.e_money + "円\n";
    s += "=== 購入した商品 ===\n";
    for (int i = 0; i < purchased_items.size(); ++i) {
      s += this.purchased_items.get(i) + ", ";
    }
    return s;
  }

  public void print() {
    System.out.println(this.toString());
  }
}
