package practice;

public class Calculator {
  private double tax= 0;
  private int price=0;

  public void setTax(double tax){
this.tax=tax;
  }

  public double calc(int price){
    return price * tax;
  }
}
