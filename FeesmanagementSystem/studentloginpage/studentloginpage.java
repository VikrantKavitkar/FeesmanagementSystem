package studentloginpage;

import java.util.Scanner;
import studentdashboard.*;

public class studentloginpage {
    
      public static void studentloginfunc() {
        System.out.println("Welcome to Student Login Page");
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
    
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
    
        // Perform authentication
        if (username.equals("student") && password.equals("password")) {
          System.out.println("Login successful!");


          // Open student dashboard
          studentdashboard studentdashboard1 = new studentdashboard();
          studentdashboard1.studentdashboard();

        } else {
          System.out.println("Login failed!");
        }
      }
    }
