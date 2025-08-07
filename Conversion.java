//Mingxuan Zhao 19413671
import java.util.Scanner;
public class Conversion {
  private static Scanner kb;
  static double meters;
  private static void menu() {
    System.out.println("1. Conver to kilometers");
    System.out.println("2. Conver to inches");
    System.out.println("3. Conver to feet");
    System.out.println("4. Quit the program");
  }
  private static void showKilometers() {
    double kilometers = meters * 0.001;
    System.out.println(" " + meters +" meters is " +kilometers + " kilometers");
  }
  private static void showInches() {
    double inches = meters * 39.37;
    System.out.println(" " + meters +" meters is " +inches + " inches");
  }
  private static void showFeet() {
    double feet = meters * 3.281;
    System.out.println(" " + meters +" meters is " +feet + " feet");
  }
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    kb = new Scanner(System.in);
    int choice; // the choice number
    //under line for choice
   System.out.println("Please enter meters:");
   meters = kb.nextDouble();
   while(meters <= 0) {
     System.out.println("Meters should be greater than zero.");
     System.out.println("please reenter:");
     meters = kb.nextDouble();
   }
   while(meters > 0) {
     menu();
     System.out.println("Enter your choice: ");
     choice = kb.nextInt();
     while(choice < 1 || choice > 4) {
       System.out.println("You need to ertern a number from the choice menu.");
       System.out.println("Please reenter:");
       menu();
       choice = kb.nextInt();
     }
     if(choice <= 1) {
       showKilometers(); 
     }else if(choice <= 2) {
       showInches();
     }else if(choice <= 3) {
       showFeet();
     }
     if(choice >= 4) {
       System.out.println("End");
       break;
     }
     }
   }
}
