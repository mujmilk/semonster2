package semonster2;

import java.util.Random;
import java.util.Scanner;



public class Vending_machine {


  public static String buy(int n, int money) {
    String

    roulette();
    return
  }

  public static String roulette() {
    Scanner scanner = new Scanner(System.in);

    Random rand = new Random();
    int num_1=rand.nextInt(9);
    int num_2=rand.nextInt(9);
    int result =0;

    for(int i=0; i<4; i++){
      if(i==3){
        System.out.println(num_2);
      }else{
        System.out.print(num_1);
      }
    }

    if(num_1 == num_2){
      result = 1;
      System.out.println("当たり，好きなやつをもう一本えらんで");
      int drink_num = scanner.nextInt();

      //drink_numの在庫を減らす処理
    }else{
      System.out.println("はずれ～～～～");
    }

    
    return
  }

}
