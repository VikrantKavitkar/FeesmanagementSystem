package admindashboard;
import java.util.Scanner;
import welcomepage.*;

/* Linked list's Node is a student*/
class Student { 
    public int prn;
    String firstName;
    String lastName;
    String email;
    Student next;
    boolean feesPaid;
  //  public Object Student;
//    Student head;

    public int getPrn() {
        System.out.print("Enter prn :");
        Scanner scanner= new Scanner(System.in);
        int prn1= scanner.nextInt();
        return prn1;
    }
  
    // Constructor to create a new node 
    // Next is by default initialized 
    // as null 
    Student(int prn,String fname,String lname,String mail, boolean feesPaid) { 
        this.prn = prn;
        this.firstName = fname;
        this.lastName = lname;
        this.email = mail;
        // this.head=null; 
        
    }

}
// end of student class-------------------------------------

// Start of linkedlist
  class StudentsLinkedList /*extends Student*/{
    //StudentsLinkedList(){
   // }
    Student head;
    // function to insert a new Student
    public boolean insertStudent(Student s){
        // If the Linked List is empty, 
        // then make the new node as head 
        if (this.head == null) { 
            this.head = s; 
            return true;  // Student  add zala 
        } 
        else { 
            // Else traverse till the last node 
            // check if the id already exists
            // and insert the new_node at last 
            Student last = this.head; 
            while (last.next != null) {   // travel till last node  to check last 
                if(last.prn == s.prn){
                    //if other student has same id,
                    //it will not inse
                    
                }
                last = last.next; 
            }
  
            // Insert the new_node at last node after all checks
            last.next = s; 
        } 
  
        // Return the true
        return true; 
    }
    
    
    // function to delete the Student
    public boolean deleteStudent(int prn){
        // Store head node 
        Student currNode =this.head ;
        Student prev = null; 
        
        //CASE 1:
        // If head node itself holds the id to be deleted 
        if (currNode != null && currNode.prn == prn) { 
            this.head = currNode.next; // Changed head 
            // Return true, after deletion 
            return true; 
        } 
  
        // CASE 2: 
        // If the id is somewhere other than at head 
  
        // Search for the id to be deleted, 
        // keep track of the previous node 
        // as it is needed to change currNode.next 
        while (currNode != null && currNode.prn != prn) { 
            // If currNode does not hold key 
            // continue to next node 
            prev = currNode; 
            currNode = currNode.next; 
        }
        // If the id was present, it should be at currNode 
        // Therefore the currNode shall not be null 
        if (currNode != null) { 
            // Since the id is at currNode 
            // Unlink currNode from linked list 
            prev.next = currNode.next; 
            return true;
        } 
        
        // CASE 3:
        // id is not present in the linked list 
        return false;
    }
    
    //function to search the student 
    public Student search(int prn1){
        // If the Linked List is empty, 
        // return null
        //Student current= this.head;
        Student currNode = this.head; 
        if (currNode == null) { 
            return null;
        } 
        else { 
            // Else traverse till the last node 
            // check if the info exists
          //  Student currNode = this.head; 
            while (currNode != null) {
                if(currNode.prn==prn1)
                   
                   {
                    //if other student has info, return that student
                    return currNode;
                    }
                currNode = currNode.next; 
            }
            //check for the final remaining node 
               // if(currNode.firstName.equals(info)&&
                  // currNode.lastName.equals(info)&&
                   //currNode.email.equals(info)
                   //)
                  //// {
                    //if other student has info, return that student
                  //  return currNode;
                    }
            //at last node after all checks, if no node match with info
            return null;
        }


        // SetFeesPaid function in linkedlist class
        public boolean setFeesPaid(int prn1) {
            //   StudentsLinkedList  obj = new StudentsLinkedList();
                   Student current = this.head;
                   while (current != null) {
                       if (current.getPrn() == prn1) {
                          // current.setFeesPaid(true);
                          
                           System.out.println("Fees set to paid for student with PRN " + prn1);
                           return true;
                       }
                       current = current.next;
                   }
                   System.out.println("Student with PRN " + prn1 + " not found.");
                   return false;
               }
 
    // Method to print the LinkedList. 
    // public void printList() 
    // { 
    //     Student currNode = this.head; 
   
    //     System.out.print("\nLinkedList: "); 
   
    //     // Traverse through the LinkedList 
    //     while (currNode != null) { 
    //         // Print the data at current node 
    //         System.out.print("("+currNode.prn +","+currNode.firstName+ ")" +" ---> ");
    //         // Go to next node 
    //         currNode = currNode.next; 
    //     } 
          
    //     System.out.println(); 
    // }
  }
public class admindashboard{
    public static void welcometoadmindashboardfunc() {
        System.out.println("Welcome to the dashboard");
        System.out.println("Choose an option:");
        
        Scanner scanner = new Scanner(System.in);
        
        StudentsLinkedList studentList = new StudentsLinkedList();
      //  Student studentobj1 =new Student(0, null, null, null, false);

        while (true) {
            System.out.println("1. Add a new student");
            System.out.println("2. Delete a student");
            System.out.println("3. Search for a student");
            System.out.println("4. Mark fees as paid");
            System.out.println("5. back to welcome page");
            System.out.println("6. Quit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add a new student
                    System.out.println("Enter the student details:");

                    System.out.print("PRN: ");
                   //
                        // Add a new student
                        //System.out.println("Enter the student details:");
                        int prn = scanner.nextInt();
                        
// int prn = 0;
// boolean validInput = false;
// do {
//     try {
//         System.out.print("PRN: ");
//         prn = scanner.nextInt();
//         validInput = true;
//    } catch (InputMismatchException e) {
//         System.out.println("Invalid input! Please enter a valid integer PRN.");
//         scanner.next(); // Clear the scanner buffer
//     }
// } while (!validInput);

// Continue with the rest of the code

                    //



                    System.out.print("First name: ");
                    String firstName = scanner.next();

                    System.out.print("Last name: ");
                    String lastName = scanner.next();

                    System.out.print("Email: ");
                    String email = scanner.next();

                    boolean feesPaid = true;

                    Student newStudent = new Student(prn, firstName, lastName, email,feesPaid);
                    if (studentList.insertStudent(newStudent)) {
                        System.out.println("Student added successfully.");
                    } else {
                        System.out.println("PRN already exists. Please try again.");
                    }
                    break;
                case 2:
                    // Delete a student
                    System.out.print("Enter the PRN of the student to delete: ");
                    prn = scanner.nextInt();

                    if (studentList.deleteStudent(prn)) {
                        System.out.println("Student deleted successfully.");
                    } else {
                        System.out.println("Student not found. Please try again.");
                    }
                    break;
                case 3:
                   // Search for a student
                    System.out.println("Enter the student info to search:");
                    int prn1 = scanner.nextInt();
                      
                    Student searchedStudent = studentList.search(prn1);
                    if (searchedStudent != null) {
                        System.out.println("Student found: " + searchedStudent.firstName + " " + searchedStudent.lastName);
                    } else {
                        System.out.println("Student not found. Please try again.");
                    }
                    break;

                case 4:
                    // Mark fees as  paid for a student

                    /*
                    */
                    
                      // Mark fees paid
                System.out.print("Enter the PRN of the student to mark fees paid: ");
                prn = scanner.nextInt();
                // Student studentclassobj = new Student();

                if (studentList.setFeesPaid(prn)) {
                    System.out.println("Fees marked as paid successfully.");
                } else {
                    System.out.println("Student not found or fees already marked as paid. Please try again.");
                }
                break;
                


                case 5:
                    //Back to student main 
                     System.out.println("Back to main menu...");
                         welcomepage welcome1 = new welcomepage();
                            welcome1.welcommefunc();
                    break;
                case 6:
                    // Quit the program
                    System.out.println("Quitting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
                    break;
                    
            }
        }
    }
}

