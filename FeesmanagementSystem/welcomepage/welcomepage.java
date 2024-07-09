package welcomepage; // package for welcome page

import java.util.Scanner;   // Std input lib
import adminloginpage.*;  // adminlogin page package for user name , password  
import studentloginpage.*;  // Studentlogin page package for user name , password 

import studentdashboard.studentdashboard;

public class welcomepage {
  public void welcommefunc(){ 
  
    System.out.println("Welcome to Fees Management System");  
    System.out.println("Please choose an option:");
    System.out.println("1. Admin Login");
    System.out.println("2. Student Login");

    Scanner scanner = new Scanner(System.in);   // defn scanner class obj 
    int choice = scanner.nextInt();          // obj tya madhe  store  honar i/p from user  

    adminloginpage Adminpagelog1 = new adminloginpage();     // create obj fro class 
    studentloginpage  Studentpagelog1 = new studentloginpage();   // create obj 
    studentdashboard Studentdashboard1 = new studentdashboard();

    switch(choice) {
      case 1:
        //  admin login page
        Adminpagelog1.adminloginpage();   // dot operator calls   func of a class  
        break;
      case 2:
        //  student login page
        Studentpagelog1.studentloginfunc();
        Studentdashboard1.studentdashboard();
        break;
      default:
        System.out.println("Invalid choice!");
        break;
    }
  }

}