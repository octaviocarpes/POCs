package com.example.pocimagetobase64.POCImagetoBase64.db;

import com.example.pocimagetobase64.POCImagetoBase64.model.Image;

import java.util.ArrayList;
import java.util.List;

public class ImageDB {


    private List<Image> imageArray;

    public ImageDB() {
        this.imageArray = new ArrayList<>();
    }

    public void addImageToDatabase(Image image){
        imageArray.add(image);
    }

    public Image getImagebyName(String imageName){
        for (Image image:imageArray
             ) {
            if(image.getImageName().equals(imageName)){
                return image;
            }
        }
        return null;
    }

    public List<Image> getImageArray(){
        return imageArray;
    }

}
