
//Raymond Truong
//Mo
//Alyssa Melendez
import java.util.Scanner;

class RollingDice {
  public static void main(String[] args) {
   System.out.println("Rolling two dice");
   System.out.print("Die 1: ");
   double Die1 = Math.floor(Math.random() * 6)+1;
   System.out.println(Die1);
 
  System.out.print("Die 2: ");
  double Die2 = Math.floor(Math.random() * 6)+1;
  System.out.println(Die2);
  
  System.out.println("Sum = " + (Die1+Die2));

  }
}
