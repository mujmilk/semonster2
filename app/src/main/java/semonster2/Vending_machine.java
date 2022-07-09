package semonster2;

import java.util.Scanner;

public class Vending_machine {
  public Beverage[] beverage;

  Vending_machine() {
    this.beverage[0] = new Beverage(100, "いろはす", 0);
    this.beverage[1] = new Beverage(200, "梅よろし", 1);
    this.beverage[2] = new Beverage(300, "コーラ", 2);
  }

  public static String[] buy(int n, int money, Vending_machine vend) {
    String[] result = new String[2];
    int change;

    if (vend.beverage[n].price > money || vend.beverage[n].stock == 0 || vend.beverage.length < n || n < 0) {
      // 買えない
      change = money;
      result[0] = "False" + ":" + "N" + ":" + String.valueOf(change);
    } else {
      vend.beverage[n].stock--;// 在庫を減らす
      change = money - vend.beverage[n].price;// moneyからnの値段文ひいておつり
      result[1] = roulette(n, vend);
      result[0] = "True" + ":" + vend.beverage[n].name + ":" + String.valueOf(change);
    }
    return result;
  }

  public static String roulette(int n, Vending_machine vend) {
    Scanner scanner = new Scanner(System.in);

    String result;

    if (n % 10 == 1) {
      System.out.println("7777");
      System.out.println("当たり，好きなやつをもう一本えらんで");
      int drink_num = scanner.nextInt();
      while (drink_num < 0 || vend.beverage.length < drink_num) {
        System.out.println("そんな商品番号はないもう一度選べ");
        drink_num = scanner.nextInt();
      }
      while (vend.beverage[drink_num].stock == 0) {
        System.out.println("その商品は在庫がありません");
        drink_num = scanner.nextInt();
      }
      vend.beverage[drink_num].stock--;// 在庫を減らす
      result = "True" + ":" + String.valueOf(drink_num);

      // drink_numの在庫を減らす処理
    } else {
      System.out.println("はずれ～～～～");
      result = "False" + ":" + "N";
    }
    scanner.close();

    return result;
  }

}
