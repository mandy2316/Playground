//This is a simple application for calculating the distance of a falling object.
import java.util.Scanner;
public class Gravity {
  private static Scanner kb;
  public static void main(String[] args) {
    kb = new Scanner(System.in);
    // TODO Auto-generated method stub
    double maxTime; //user enter value.
    double g = 9.8;
    double distance;
    int time = 1; 
    System.out.println("Please enter the maxTime: ");
    maxTime = kb.nextDouble();
    while(maxTime<=0) {
      System.out.println("The maxTime need be greater than zero.");
      System.out.println("Please reenter a value: ");
      maxTime = kb.nextDouble();
    }
    System.out.println("time(s) distance(m)");
    
    while(time<=maxTime) {
      distance = 0.5*g*time*time;
      System.out.print(" " + time +"     ");
      System.out.println(" " + distance);
      time++;
    }
  }

}
