import java.util.Scanner;

public class DividindoXporY {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    
    for (int i = 0; i < n; i++) {
      double x = input.nextDouble();
      double y = input.nextDouble();
     
      if (y == 0) {
        System.out.println("divisao impossivel");
      } else {
        System.out.printf("%.1f\n", (double)(x/y));
      }
    }
  }
}