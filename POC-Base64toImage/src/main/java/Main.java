import model.Base64toImage;
import model.FileReader;

public class Main {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader("src/images/intellij_64.txt");
        fileReader.readFile();

        Base64toImage base64toImage = new Base64toImage(fileReader.getFileText());

        base64toImage.decodeImage();
    }
}
