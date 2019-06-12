import java.util.Scanner;

class IncomeTax {
  public static void main(String[] args) {
    Scanner kin = new Scanner(System.in);
    
    System.out.println("Calculating Income Tax");
    System.out.println();
    System.out.print("Total income for the year: $");
      int income =kin.nextInt();
    
    if (income >= 0 && income <= 9525){
      System.out.println("Tax to be paid: $" + income * .1);
    }
    
    if (income > 9525 && income <= 38700){
      System.out.println("Tax to be paid: $" + (952.50 + (income - 9525) * .12));
    }
    
    if (income > 38700 && income <= 82500){
      System.out.println("Tax to be paid: $" + (4453.50 + (income - 38700) * .22));
    }
    
    if (income > 82500 && income <= 157500){
      System.out.println("Tax to be paid: $" + (14089.50 + (income - 82500) * .24));
    }
  
   if (income > 157500 && income <= 200000){
      System.out.println("Tax to be paid: $" + (32089.50 + (income - 157500) * .32));
    }
  
  if (income > 200000 && income <= 500000){
      System.out.println("Tax to be paid: $" + (45689.50 + (income - 200000) * .35));
    }
  
  if (income > 500000){
      System.out.println("Tax to be paid: $" + (150689.50 + (income - 500000) * .37));
    }
  
  }
}