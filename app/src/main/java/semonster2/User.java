package semonster2;

public class User {
  public int e-money;
  public int money;
  private ArrayList<String> purchased_items = new ArrayList<>();

  User(int m, int e) {
    this.money = m;
    this.e-money = e;
  }

  public void print_moeny() {
    System.out.println("現金: " + this.money + "円, 電子マネー: " + this.e-money + "円");
  }

  public void addPurchasedItems(String str) {
    purchased_items.add(str);
  }

  public void print_purchased_items() {
    System.out.println("=== 購入した商品 ===");
    for (int i=0; i<purchased_items.size(); ++i) {
      System.out.print(purchased_items[i] + ", ");
    }
    System.out.println("");
  }

}
