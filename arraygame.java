import java.util.Scanner;
import java.util.Random;
public class arraygame {
  public static void main(String[] args) {
    int x=0;
    int y=0;
    int xcor = (int)Math.floor(Math.random()*(0+3));
    int ycor = (int)Math.floor(Math.random()*(0+3));
    //System.out.println(xcor);
    //System.out.println(ycor);
    Scanner kin = new Scanner(System.in);
    System.out.println("I need above a C in this class");
      int[][] scores = { {1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0} };
    scores[ycor][xcor]=scores[ycor][xcor]-1;
      while ((scores[ycor][xcor])<0) {
        for(int[] row : scores){
          for(int s: row){
            System.out.print(s + " ");
          }
          System.out.println();
        }
        System.out.print("Enter Up, Down, Left, or Right to move ");
        String mov = kin.nextLine();
        if (mov.equals("Right")) {
          if (x==3){
            System.out.println("WRONG");
          }
          else{
            scores [y][x] = scores [y][x]-1;
            scores [y][x+1]=scores [y][x+1]+1;
            x=x+1;
          }
        }
        else if (mov.equals("Down")) {
          if (y==3) {
            System.out.println("WRONG");
          }
          else{
            scores [y][x] = scores [y][x]-1;
            scores [y+1][x]=scores [y+1][x]+1;
            y=y+1;
          }
        }
        else if (mov.equals("Up")) {
          if(y==0) {
            System.out.println("WRONG");
          }
          else{
            scores [y][x] = scores [y][x]-1;
            scores [y-1][x]=scores [y-1][x]+1;
            y=y-1;
          }
        }
        else if (mov.equals("Left")) {
          if (x==0){
            System.out.println("WRONG");
          }
          else{
            scores [y][x] = scores [y][x]-1;
            scores [y][x-1]=scores [y][x-1]+1;
            x=x-1;
          }
        }
      }
    System.out.println("winner winner chicken dinner");

  }
}