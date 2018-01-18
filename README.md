# POCs

In this repo you will find all my Proof of Concepts that i need for my studies and Work.

## POC-Base64toImage
This POC can convert base64 Strings to .png images<br>
### How to Use it?
In the images folder inside the src folder, create a .txt file with the base64 String. Then in the Main class Change the String inside the new <strong>FileReader("src/images/chosen-file.txt")</strong> to the chosen file you want to open. After that just run the project and you are good to go!

## POC-HtmlPdf
This POC converts an html file, using it as a template, to a pdf file.<br>
### How to Use it?
Insert the html file that you want to use as a template into the template directory in src/template then run the project. The pdf will be generated in the result-pdf directory with the name result.pdf.


## POC-TemporaryFiles
This POC just simply create temporary files and delete them (Not that useful).

## POC-Springboot
This is my first usage of Springboot. It was made following the <a href="https://spring.io/guides/gs/spring-boot/">Springboot</a> getting started documentation. Its useful to study when you want to understand how web APIs work. 
### How to Use it?
Run the project and then just enter the following URL into any browser and thats it!<br>
http://localhost:8080

## POC-Springboot-SecureWeb
This is the Springboot POC with a feature of Springboot called Secure Web. This POC works like the other, the only difference is that this one makes a user authentication.
### How to Use it?
Run the project and then enter http://localhost:8080 into your browser and try to login. To make the login you must enter "user" for user and "password" for the password, otherwise it will not display the hello.html page.

## POC-Springboot-EmailService
This POC send emails with javamail. In this POC i used Springboot to test the service through the endpoints /simpleemail, /simpleemail2 and /simpleemail3. Each one of those endpoints sends a different type of email like with attachments or an HTML body.<br>
<strong>Reference: </strong><a href="https://www.quickprogrammingtips.com/spring-boot/how-to-send-email-from-spring-boot-applications.html">How to Send Email From Spring Boot Applications</a>

### How to Use it?
Just run the project and enter into one of this endpoints:
<ul>
  <li>
    <a href="http://localhost:8080/simpleemail">/simpleemail</a>
  </li>
  <li>
    <a href="http://localhost:8080/simpleemail2">/simpleemail2</a>
  </li>
  <li>
    <a href="http://localhost:8080/simpleemail3">/simpleemail3</a>
  </li>
</ul>
that the API will do the magic.

## Resources and useful links that i found during my studies
<a href="https://start.spring.io/">spring initializr</a>
