package semonster2;

import java.util.Scanner;

public class Vending_machine {
  public Beverage[] beverage;

  Vending_machine(int test) {   //test用
    Beverage[] beverages = new Beverage[3];

    beverages[0] = new Beverage(100, "いろはす", 0);
    beverages[1] = new Beverage(200, "梅よろし", 1);
    beverages[2] = new Beverage(300, "コーラ", 2);
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
    Scanner scanner = new Scanner(System.in);

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
    scanner.close();

    return result;
  }

}
