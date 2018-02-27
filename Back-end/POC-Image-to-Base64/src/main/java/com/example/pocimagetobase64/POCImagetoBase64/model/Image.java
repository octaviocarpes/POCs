package com.example.pocimagetobase64.POCImagetoBase64.model;

public class Image {

    private String base64String;
    private String imageName;

    public Image(String imageName, String base64String) {
        this.imageName = imageName;
        this.base64String = base64String;
    }

    public String getBase64String() {
        return base64String;
    }

    public void setBase64String(String base64String) {
        this.base64String = base64String;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
