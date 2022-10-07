package controller;
//import model.WoodItem;
import java.util.Random;
import java.util.Scanner;  // Import the Scanner class

//import org.apache.pdfbox.pdmodel.PDAbstractContentStream;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
//import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.pdmodel.*;
/*import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
/**
 * @author Rinnah
 *
 */
public class HardwoodSeller {

    public static void main(String[] args) throws IOException {
      //move random to Wooditem
        Random rnd = new Random();
        int invoice_id = 0 + rnd.nextInt(10000000);
        System.out.println(invoice_id);

       PDDocument document = new PDDocument(); //invoice create
        System.out.println("PDF created");
        PDPage page = new PDPage();
        document.addPage(page);
        PDPageContentStream contentStream = new PDPageContentStream(document, page);
        contentStream.addComment("Belmont University;1900 Belmont Blvd, Nashville, TN 37212;09/20/2022 White Oak:515;Wenge:320");
        document.save("woodInvoice_"+(invoice_id) +".pdf");
        System.out.println("PDF created");

       /* PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
        document.open();
        document.add(new Paragraph("A Hello World PDF document."));
        document.close();
        writer.close(); */
    }

    /**
    * Method for reading the input file to be processed by the Hardwood Seller
     **/
    public void readInputFile(String inputFilePath){

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter full name of the buyer:");
        String BuyerName = myObj.nextLine();  // Read user input
        System.out.println("Buyer is: " + BuyerName);

        System.out.println("Enter Address:");
        String Address = myObj.nextLine();  // Read user input
        System.out.println("Address is: " + Address);

        System.out.println("Enter Date:");
        String Date = myObj.nextLine();  // Read user input
        System.out.println("Date is: " + Date);

        System.out.println("Enter WoodType:");
        String WoodTypes = myObj.nextLine();  // Read user input
        System.out.println("WoodTypes: " + WoodTypes);

        System.out.println("Enter amount:");
        String Amount = myObj.nextLine();  // Read user input
        System.out.println("Amount is: " + Amount);



    }

    /**
     * Method that computes the delivery ETA
     **/
    public Double deliveryTime(){
        Double deliveryETA = 0.0;
        return deliveryETA;

       // WoodItem wood = new WoodItem();

    }

}