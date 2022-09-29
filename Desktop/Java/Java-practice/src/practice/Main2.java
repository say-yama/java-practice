package practice;

public class Main2 {
  public static void main(String[] args){
    Shop s1 = new Shop();
    Shop s2 = new Shop();
    s1.name = "パン屋";
    s1.sale = 100000;
    s2.name = "洋服屋";
    s2.sale = 150000;
    System.out.println(s1.name+s1.sale);
    System.out.println(s2.name+s2.sale);
  }
}
