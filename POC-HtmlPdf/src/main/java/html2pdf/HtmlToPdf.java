package html2pdf;

import com.itextpdf.html2pdf.HtmlConverter;

import java.io.File;
import java.io.IOException;

public class HtmlToPdf {

    public HtmlToPdf() {
    }

    public void convertHTMLtoPDF(){
        File html = new File("src/template/html-template.txt");
        File pdf = new File("src/result-pdf/result.pdf");
        try {
            HtmlConverter.convertToPdf(html,pdf);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
