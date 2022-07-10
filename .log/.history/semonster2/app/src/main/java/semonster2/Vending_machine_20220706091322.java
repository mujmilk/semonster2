package semonster2;

public class Vending_machine {

  Vending_machine( ) {
    Beverage[] beverages = new Beverage[20];

    int beverageNum = rand.nextInt(20);
    // System.out.println(beverageNum);
    for (int i = 0; i < beverageNum; ++i) {
      beverages[i] = new Beverage((rand.nextInt(20) + 1) * 10, name_init(), rand.nextInt(20), i);
      beverages[i].print();
    }
  }



}
