package excel;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {
  public static void writeStudentDetailsToExcel(String name, int rollNumber, String email, double fees, String dueDate) throws IOException {
    // Create a new Excel workbook and sheet
    XSSFWorkbook workbook = new XSSFWorkbook();
    XSSFSheet sheet = workbook.createSheet("Student Details");

    // Create a header row
    Row headerRow = sheet.createRow(0);
    Cell headerCell1 = headerRow.createCell(0);
    headerCell1.setCellValue("Name");
    Cell headerCell2 = headerRow.createCell(1);
    headerCell2.setCellValue("Roll Number");
    Cell headerCell3 = headerRow.createCell(2);
    headerCell3.setCellValue("Email");
    Cell headerCell4 = headerRow.createCell(3);
    headerCell4.setCellValue("Fees");
    Cell headerCell5 = headerRow.createCell(4);
    headerCell5.setCellValue("Due Date");



 // Create a new row for each student and write their details
 int rowIndex = 1;
 for (Student student : students) {
   Row row = sheet.createRow(rowIndex++);
   Cell cell1 = row.createCell(0);
   cell1.setCellValue(student.getName());
   Cell cell2 = row.createCell(1);
   cell2.setCellValue(student.getRollNumber());
   Cell cell3 = row.createCell(2);
   cell3.setCellValue(student.getEmail());
   Cell cell4 = row.createCell(3);
   cell4.setCellValue(student.getFees());
   Cell cell5 = row.createCell(4);
   cell5.setCellValue(student.getDueDate());
 }

 // Write the Excel file
 FileOutputStream outputStream = new FileOutputStream("StudentDetails.xlsx");
 workbook.write(outputStream);
 workbook.close();

 System.out.println("Student details written to Excel file.");
} catch (IOException e) {
 System.out.println("Error writing student details to Excel file: " + e.getMessage());
}
}






//before code wala code aahe ha 
////////////////////////////////////////////////////////////////////////////////////////////////
    // Create a new row for the student details
    // Row row = sheet.createRow(1);
    // Cell cell1 = row.createCell(0);
    // cell1.setCellValue(name);
    // Cell cell2 = row.createCell(1);
    // cell2.setCellValue(rollNumber);
    // Cell cell3 = row.createCell(2);
    // cell3.setCellValue(email);
    // Cell cell4 = row.createCell(3);
    // cell4.setCellValue(fees);
    // Cell cell5 = row.createCell(4);
    // cell5.setCellValue(dueDate);

    // // Write the Excel file
    // FileOutputStream outputStream = new FileOutputStream("StudentDetails.xlsx");
    // workbook.write(outputStream);
    // workbook.close();
//////////////////////////////////////////////////////////////////////////////////////////////











