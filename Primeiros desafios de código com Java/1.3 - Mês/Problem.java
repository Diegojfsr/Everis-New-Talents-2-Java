import java.io.IOException;
import java.util.Scanner;

public class Problem {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int month;
    month = input.nextInt();
    switch(month)
    {
    case 1:
        System.out.printf("January\n");
        break;
    case 2:
        System.out.printf("February\n");
        break;
       
    //continue sua solução aqui.

    default:
        System.out.printf("Invalid input\n");
    }
  }   
}