import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("images/embed2.jpg");

        byte[] encodedFile = Base64.encodeBase64(FileUtils.readFileToByteArray(file));

        String base64Image = new String(encodedFile, StandardCharsets.US_ASCII);

        System.out.println(base64Image);

        byte[] byteArray = java.util.Base64.getEncoder().encode(base64Image.getBytes());

        for (int i = 0; i < byteArray.length; i++) {
            System.out.print(byteArray[i]);
        }

        byte[] decodedString = java.util.Base64.getDecoder().decode(new String(byteArray).getBytes());

        System.out.println();

        System.out.println(new String(decodedString));

        if (base64Image.equals(new String (decodedString))){
            System.out.println("Equals!");
        }

    }
}

