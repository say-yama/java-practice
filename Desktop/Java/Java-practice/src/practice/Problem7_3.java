package practice;

public class Problem7_3 {
  public static void main(String args[]) {
    Calculation c = new Calculation();
    c.setNumber1(8);
    c.setNumber2(9);
    System.out.println(c.getNumber1() + "+" + c.getNumber2() + "=" + c.add());
    System.out.println(c.getNumber1() + "-" + c.getNumber2() + "=" + c.sub());
  }
}