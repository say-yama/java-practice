package practice;

public class Problem7_2 {
  public static void main(String args[]) {
    TwoStrings s = new TwoStrings();
    s.setString1("Hello");
    s.setString2("World");
    System.out.println("1つ目の文字は" + s.getString1());
    System.out.println("2つ目の文字は" + s.getString2());
    System.out.println("3つ目の文字は" + s.getConnectedString());
  }
}