package com.example.pocimagetobase64.POCImagetoBase64.controller;

import com.example.pocimagetobase64.POCImagetoBase64.model.Image;
import com.example.pocimagetobase64.POCImagetoBase64.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ImageController {


    @CrossOrigin
    @RequestMapping(
            value = "/uploadImage",
            method = RequestMethod.POST,
            consumes = "application/json"
    )
    @ResponseBody
    public ResponseEntity uploadImage(@RequestBody String base64String){
        ResponseEntity responseEntity = new ResponseEntity(HttpStatus.BAD_REQUEST);
        if (base64String != null){
            System.out.println(base64String);
            return new ResponseEntity(HttpStatus.OK);
        }
        return responseEntity;
    }

}
