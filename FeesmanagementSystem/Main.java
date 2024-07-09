import welcomepage.*;

// import java.io.IOException;
// import excel.ExcelWriter;

class Main{
    public static void main(String[] args) {

        // WelcomePage  code (package call for  welcomePage)
        welcomepage welcome1 = new welcomepage();  // obj for welcomepage class 
        welcome1.welcommefunc();  //func call through obj  

        // try {
        //     ExcelWriter.writeStudentDetailsToExcel("John Doe", 1234, "johndoe@example.com", 1000.0, "2023-04-15");
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
    }

}