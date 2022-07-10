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
    Random rand = new Random();
    int num_1=rand.nextInt(9);
    int num_2=rand.nextInt(9)

    for(int i=0; i<4; i++){
      if(i==3){
        System.out.println(num_2);
      }else{
        System.out.print(num_1);
      }
    }

    if(num_1 == num_2){
      System.out.println("当たり");
      
      //在庫を減らす処理
    }else{
      System.out.println("はずれ～～～～");
    }


    return
  }

}
