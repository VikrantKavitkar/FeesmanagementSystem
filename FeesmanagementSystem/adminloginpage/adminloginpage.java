package adminloginpage;

import admindashboard.*;
import java.util.Scanner;

public class adminloginpage{
  public static void adminloginpage() {
    System.out.println("Welcome to Admin Login Page");
    Scanner scanner = new Scanner(System.in);
    boolean loggedIn = false;

    while(!loggedIn) {
      System.out.print("Enter username: ");
      String username = scanner.nextLine();

      System.out.print("Enter password: ");
      String password = scanner.nextLine();

      // Perform authentication
      if (username.equals("admin") && password.equals("password")) {
        System.out.println("Login successful!");
        loggedIn = true;
        // Open admin dashboard
        admindashboard admindashboard1 = new admindashboard();    
        admindashboard1.welcometoadmindashboardfunc(); 
      } else {
        System.out.println("Login failed!");
        System.out.println("Try again");
      }
    }
  }
}
