import html2pdf.HtmlToPdf;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) {
        HtmlToPdf htmlToPdf = new HtmlToPdf();

        htmlToPdf.convertHTMLtoPDF();

        File resultPDF = new File("src/result-pdf/result.pdf");


        try {
            byte[] array = Files.readAllBytes(resultPDF.toPath());
            System.out.println(array.length);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
