package semonster2;



public class Beverage {

  public int price;
  public String name;
  public int stock;

  Beverage(int p, String n, int s、int id) {
    this.price = p;
    this.name = n;
    this.stock = s;
    this

  }

  public void print() {
    System.out.println(name + ": 価格: " + price + "円 在庫: " + stock + "個");
  }


}
