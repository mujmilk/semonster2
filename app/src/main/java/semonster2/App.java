/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package semonster2;

import java.util.Random;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    //user生成
    System.out.print("所持金を入力してください: ");
    int m = scan.nextInt();

    System.out.print("e_moneyの所持金を入力してください(未所持の場合は0): ");
    int e = scan.nextInt();

    User user = new User(m, e);

    //自販機生成
    Vending_machine vending_machine = new Vending_machine();

    //行動選択
    while (true) {

      int use = 0; // money: 0, e_money:1

      if (user.money > 0 && user.e_money > 0) {
        System.out.println("現金と電子マネーのどちらを使用しますか？");
        user.print_money();
        System.out.println("現金: 0, 電子マネー: 1");
        use = scan.nextInt();
      } else (user.money > 0) {
        System.out.println("現金を使用します");
      } else (user.e_money > 0) {
        System.out.println("電子マネーを使用します");
        use = 1;
      } else {
        System.out.println("現金を所持していません");
        break;
      }

      System.out.println("購入する商品を選択してください．");
      //自販機クラスのインスタンス.print();
      int purchase_num = scan.nextInt();

      String isBuyable;
      String purchased_item;
      int charge;
      String isBuyable_2;
      String purchased_item_2;
      if (use == 0) { // 現金を使用する場合
        String[] return_lists = vending_machine.buy(purchase_num, user.money);
        String[] buy_one = return_lists[0].split(":");
        String[] buy_two = return_lists[1].split(":");

        isBuyable = buy_one[0];
        purchased_item = buy_one[1];
        charge = Integer.parseInt(buy_one[2]);

        isBuyable_2 = buy_two[0];
        purchased_item_2 = buy_two[1];

      } else { // 電子マネーを使用する場合
        String[] return_lists = vending_machine.buy(purchase_num, user.e_money);
        String[] buy_one = return_lists[0].split(":");
        String[] buy_two = return_lists[1].split(":");

        isBuyable = buy_one[0];
        purchased_item = buy_one[1];
        charge = Integer.parseInt(buy_one[2]);

        isBuyable_2 = buy_two[0];
        purchased_item_2 = buy_two[1];
      }

      if (isBuyable.equals("True")) {
        System.out.println(purchased_item + "を購入しました。");
        user.buy(purchased_item, charge);
        if (isBuyable_2.equals("True")) {
          System.out.println(purchased_item_2 + "が当たりました。");
          user.buy(purchased_item_2);
        }
      } else {
        System.out.println("購入に失敗しました。");
      }
      user.print();

      System.out.println("続けて購入しますか？");
      System.out.println("1: はい　2: いいえ(終了する)");
      int n = scan.nextInt();
      if (n == 1) continue;
      else break;
    }
    scan.close();
  }
}
