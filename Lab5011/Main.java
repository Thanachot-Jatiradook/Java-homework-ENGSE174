package Lab5011;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Text title : ") ;
        String inputTextTitle = scanner.nextLine() ;

        System.out.println("--------------------------");

        System.out.println("Word : ") ;
        int inputTextWord = scanner.nextInt() ;

        System.out.println("--------------------------");

        scanner.nextLine() ;

        System.out.println("PDF title") ;
        String inputPDFTitle = scanner.nextLine() ;

        System.out.println("--------------------------");

        System.out.println("Page : ") ;
        int inputPDFPage = scanner.nextInt() ;

        System.out.println("--------------------------");

        scanner.nextLine() ;

        System.out.println("Text title : ") ;
        String inputTextTitle2 = scanner.nextLine() ;

        System.out.println("--------------------------");

        System.out.println("Word : ") ;
        int inputTextWord2 = scanner.nextInt() ;

        System.out.println("--------------------------");

        scanner.nextLine() ;

        System.out.println("PDF title") ;
        String inputPDFTitle2 = scanner.nextLine() ;

        System.out.println("--------------------------");

        System.out.println("Page : ") ;
        int inputPDFPage2 = scanner.nextInt() ;

        System.out.println("----------result----------");

        TextDocument text1 = new TextDocument(inputTextTitle, inputTextWord) ;
        TextDocument text2 =  new TextDocument(inputTextTitle2, inputTextWord2) ;

        PDFDocument pdf1 = new PDFDocument(inputPDFTitle, inputPDFPage) ;
        PDFDocument pdf2 = new PDFDocument(inputPDFTitle2, inputPDFPage2) ;

        Document[] doc = new Document[4] ;

        doc[0] = text1 ;
        doc[1] = text2 ;
        doc[2] = pdf1 ;
        doc[3] = pdf2 ;

        int totalpages = 0 ;

        for (Document d : doc) {

            if (d instanceof PDFDocument) {

                PDFDocument pdf = (PDFDocument) d ;
                totalpages += pdf.pageCount ;

            }

        }

        for (Document d : doc) {

            d.displayDetails() ;

        }

        System.out.println("Total pages : " + totalpages) ;

        scanner.close();

    }

}
