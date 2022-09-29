package practice;
import java.util.Random;

public class prob8_2 {
  public static void main(String args[]) {
    int c = 4;
    int total = 1;
    for (int i = 1; i < c; i++) {
      total = total * (i + 1);
    }
    System.out.println(c + "の階乗は" + total + "です。");
  }
}
