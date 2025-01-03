package p04class;

public class Ex05Casting목적 {
  public static void main(String[] args) {
    Customer customer = new Customer();
    Notebook notebook = new Notebook();
    Audio audio = new Audio();
    TV tv = new TV();
    customer.buy(tv);
    customer.buy(notebook);
    customer.buy(audio);
  }
}

class Product {
  int cost;
  public Product(int cost){this.cost = cost;}
}
class Notebook extends Product{
  public Notebook(){super(300);}
}
class Audio extends Product{
  public Audio() {super(200);}
}
class TV extends Product{
  public TV() {super(600);}
}
class Customer {
  int money = 1000;
//  void buyNB(Notebook notebook){ money -= notebook.cost;}
//  void buyAD(Audio audio){ money -= audio.cost;}
//  void buyNB(TV Tv){ money -= Tv.cost;}
  void buy(Product product){
  money -= product.cost;}
}

