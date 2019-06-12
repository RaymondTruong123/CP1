
import java.util.Scanner;

public class UserInputScanner{
    public static void main(String[] args){
        Scanner kin = new Scanner(System.in);
        
        System.out.print("What is your first name? ");
        System.out.print("What is your last name? ");
        String name = kin.nextLine();
        System.out.println("Hello " + name + ", it's nice to meet you!");
        
        
        
    }
}

