package practice;

public class prob8_1 {
  public static void main(String args[]) {
    int n = 0;
    for (int a = 1; a < 101; a++) {
      for (int b = 1; b < 101; b++) {
        for (int c = 1; c < 101; c++) {
          if (a * a + b * b == c * c) {
            System.out.print(a + "*" + a + "+" + b + "*" + b + "=" + c + "*" + c + (a * a + b * b == c * c));
            n++;
          }
        }
      }
    }
    System.out.println();
    System.out.println("数は" + n + "個です");
  }
}
