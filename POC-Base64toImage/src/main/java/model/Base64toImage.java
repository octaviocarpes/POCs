package model;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import sun.misc.BASE64Decoder;

import javax.imageio.ImageIO;

public class Base64toImage {

    private String imageString;

    public Base64toImage(String imageString) {
        this.imageString = imageString;
    }

    public void setImageString(String imageString) {
        this.imageString = imageString;
    }

    public void decodeImage(){
        String[] data = imageString.split(",");

        String imageData = data[1];

        BufferedImage image = null;
        byte[] imageByte;

        BASE64Decoder decoder = new BASE64Decoder();

        try {

            imageByte = decoder.decodeBuffer(imageData);

            ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);

            image = ImageIO.read(bis);

            bis.close();

            File outputfile = new File("result/image.png");

            ImageIO.write(image, "png", outputfile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
