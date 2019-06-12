import java.util.Scanner;

public class cashregister {
  public static void main(String[] args) {
    Scanner kin = new Scanner(System.in);
    System.out.println("Welcome to the Change Generator\n");
    System.out.println("Please Enter the amount of a Bill");
    System.out.println("Bill: \n");
    double bill = kin.nextDouble();
    System.out.println("Please enter the amount paid");
    System.out.println("Paid: \n");
    double paid = kin.nextDouble();
    System.out.println("Change: $" + (paid-bill));
    double change = (paid-bill);
    int chint = (int) (change);
    System.out.println("$20: " + (chint/20));
    double num1 = (change%20);
    int num001 = (int) (num1);
    System.out.println("$10: " + (num001/10));
    double num2 = (num1%10);
    int num002 = (int) (num2);
    System.out.println("$5: " + (num002/5));
    double num3 = (num2%5);
    int num003 = (int) (num3);
    System.out.println("$1: " + (num003/1));
    double num4 = (num3%1);
    double num04 = (num4/.25);
    int num004 = (int) (num04);
    System.out.println("$.25: " + num004);
    double num5 = (num4%.25);
    double num05 = (num5/0.1);
    int num005 = (int) (num05);
    System.out.println("$.10: " + num005);
    double num6 = (num05%0.1);
    double num06 = (num6/0.05);
    int num006 = (int) (num06);
    System.out.println("$.05: " + num006);
    double num7 = (num6%0.05);
    double num07 = (num7/0.01);
    int num007 = (int) (num07/2);
    System.out.println("$.01: " + num007);
  }
}
