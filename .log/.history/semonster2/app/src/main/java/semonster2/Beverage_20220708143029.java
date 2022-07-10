package semonster2;

public class Beverage {

  public int price;
  public String name;
  public int stock;
  public int id;

  Beverage(int p, String n, int s, int i) {
    this.price = p;
    this.name = n;
    this.stock = s;
    this.id = i;

  }

  public void print() {
    // System.out.println(name + ": 価格: " + price + "円 在庫: " + stock + "個: " + "ID="
    // + id);
    System.out.printf("%2d : %-5s :価格  : 在庫 %-3d \n", id, name, stock);
    // System.out.printf("%2d : %-15s \n", id, name);
  }

}
