package semonster2;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Vending_machine {

  public static String[] buy(int n, int money) {
    String[] result = new String[2];
    int change;

    if(vend.beverage[n].price > money || vend.beverage[n].stock == 0 || vend.beverage.length < n || n < 0){
      //買えない
      change = money;
      result[0] = "False" + ":" + "N" + ":" + Arrays.toString(change);
    }else{
      vend.beverage[n].stock--;//在庫を減らす
      change = money - vend.beverage[n].price//moneyからnの値段文ひいておつり
      result[1] = roulette();
      result[0] = "True" + ":" + vend.beverage[n].name + ":" + Arrays.toString(change);
    }
    return result;
  }

  public static String roulette() {
    Scanner scanner = new Scanner(System.in);

    Random rand = new Random();
    int num_1 = rand.nextInt(9);
    int num_2 = rand.nextInt(9);
    String result;

    for (int i = 0; i < 4; i++) {
      if (i == 3) {
        System.out.println(num_2);
      } else {
        System.out.print(num_1);
      }
    }

    if (num_1 == num_2) {
      System.out.println("当たり，好きなやつをもう一本えらんで");
      int drink_num = scanner.nextInt();
      while (drink_num < 0 || vend.beverage.length < drink_num) {
        System.out.println("そんな商品番号はないもう一度選べ");
        int drink_num = scanner.nextInt();
      }
      vend.beverage[drink_num].stock--;// 在庫を減らす
      result = "True" + ":" + Arrays.toString(drink_num);

      // drink_numの在庫を減らす処理
    } else {
      System.out.println("はずれ～～～～");
      result = "False" + ":" + "N";
    }

    return result;
  }

}
