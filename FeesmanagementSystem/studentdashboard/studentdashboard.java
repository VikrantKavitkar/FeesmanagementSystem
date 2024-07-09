package studentdashboard;

import java.util.Scanner;
import admindashboard.*;

// class Student { 
//     int prn;
//     String firstName;
//     String lastName;
//     String email;
//     Student next;
//     boolean feesPaid;
//     public Object Student;
//     Student head;
    
//     public int getPrn() {
//         System.out.print("Enter prn :");
//         Scanner scanner= new Scanner(System.in);
//         int prn1= scanner.nextInt();
//         return prn1;
//     }
  
//     // Constructor to create a new node 
//     // Next is by default initialized 
//     // as null 
//     Student(int prn,String fname,String lname,String mail, boolean feesPaid) { 
//         this.prn = prn;
//         this.firstName = fname;
//         this.lastName = lname;
//         this.email = mail;
//         this.head=null;   
//     }

// }



public class studentdashboard{
    public void studentdashboard(){
        System.out.print("Enter prn no. ");
        Scanner scanner = new Scanner(System.in);
        int sprn1 = scanner.nextInt();

        admindashboard sl = new admindashboard();
        sl.search(sprn1);
        
        sl.printList();

    }
}

   
    // class StudentsLinkedList {
    //         Student head;


// //function to search the student 
//     public Student search(int prn1){
//         // If the Linked List is empty, 
//         // return null
//         //Student current= this.head;
//         Student currNode = this.head; 
//         if (currNode == null) { 
//             return null;
//         } 
//         else { 
//             // Else traverse till the last node 
//             // check if the info exists
//           //  Student currNode = this.head; 
//             while (currNode != null) {
//                 if(currNode.prn==prn1)
                   
//                    {
//                     //if other student has info, return that student
//                     return currNode;
//                     }
//                 currNode = currNode.next; 
//             }
//             //check for the final remaining node 
//                // if(currNode.firstName.equals(info)&&
//                   // currNode.lastName.equals(info)&&
//                    //currNode.email.equals(info)
//                    //)
//                   //// {
//                     //if other student has info, return that student
//                   //  return currNode;
//                     }
//             //at last node after all checks, if no node match with info
//             return null;

//                 }

               
//     // Method to print the LinkedList. 
//     // public void printList() 
//     // { 
//     //     Student currNode = this.head; 
   
//     //     System.out.print("\nLinkedList: "); 
   
//     //     // Traverse through the LinkedList 
//     //     while (currNode != null) { 
//     //         // Print the data at current node 
//     //         System.out.print("("+currNode.prn +","+currNode.firstName+ ")" +" ---> ");
//     //         // Go to next node 
//     //         currNode = currNode.next; 
//     //     } 
          
//     //     System.out.println(); 
//     // }
//         }

        
//     }
